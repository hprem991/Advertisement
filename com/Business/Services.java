package com.Business;
//package org.glassfish.jersey.*;

import com.Dao.*;
import com.Business.*;
import java.lang.*;
import java.util.*;
import javax.ws.rs.*;
import org.hibernate.*;
import org.aopalliance.*;
import java.lang.annotation.*;
import org.hibernate.cfg.*;

/*
enum CONVERSION_UNIT {
	1.02;
}
*/

/** 
 * 
 * @author admin
 * PURPOSE :-  WebService API for handling numerous services exposed by the server
 * DESCRIPTION :- This is the main class should be exposed to web-api through web services.
 *
 */
@Path("Services")
public class Services {
	
	private static SessionFactory factory;
	
	public Services(DataSource dataSource){
		 factory = dataSource.factory;
	}
	
	
	/**
	 * @method :  getAdvertisements
	 * @input  :  Takes Location as a parameter along with the range of search.
	 * @purpose : Reveals the advertisements based on the location.
	 * @return :- The List of Advertisements
	 */
	@Path("Advertisements")
	public List<Content> getAdvertisements(double latitute,
										   double longitute, 
										   int range
										   /* Can upgrade to login for premium services */ ){
		
		Area searchArea = new Area(latitute, longitute, range, "MI"); 
		
		//double searchArea =  searchPerimeter.calculateArea(range); // Idea of Circular Search Area is Temp disabled
		
		List <Content> ads = searchForAds(searchArea);
		return ads; // Need to design the best priority of search result algorithm. 
	}
	
	@GET
	@Produces({"application/html","application/json"})
	private double convertRangeToLatitute(int range, String units){
		if (units == "Km")
			 return range * 1.02; // Need research in this conversion unit
		else if (units == "miles")
			return range * 1.11;
		else
			return range * 1.00; 
	} 
	
	private List<Content> searchForAds(Area searchArea){
	 // TODO : Use 	Advertisement Table to filter list
		List<Content> contents = null;
		Session session =  factory.openSession();
		Transaction trans =  null;
		String searchLatitute = "select id from Advertisement where LATITUTE>="+ searchArea.getMinLat() +" and "
				                 + "LATITUTE <= "+searchArea.getMaxLat();
		String searchLongitute = "select id from Advertisement where LONGITITUTE>="+ searchArea.getMinLong() +" and "
				                    + "LONGITITUTE <="+searchArea.getMaxLong();
		
		
		String searchQuery = searchLatitute + "UNION" + searchLongitute;
		try {
			trans = session.beginTransaction();
			List advertisements = session.createQuery(searchQuery).list();	
			for(Iterator iterator = advertisements.iterator();iterator.hasNext();){
				Advertisement ad = (Advertisement)iterator.next();
				int adId = ad.getId();
				contents.add(session.createQuery("select * from Content where id = " + adId));
			}
		} catch (Exception e) {
			System.out.println("Exception in Searching Ad "+e);
		}
		return contents;
	}
	
	
	private List executeHibernate(String searchQuery){
		Session session = factory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			return session.createQuery(searchQuery);
		} catch (Exception e) {
			System.out.println("Exception Occoured "+e);
		}
	}
	
	//TODO : Use the custom Sorting algorithm
	private List<Content> sortOrder(List<Content> advertisement, String Type){
		if (Type == "Range") {
			Collections.sort(advertisement, new CustomComparator());
		} else if (Type == "Discount") {
			
		} else if (Type == "Review") {
			
		} else if (Type == "") {
			
		} else { // Default Sort
			return advertisement;
		}
	}
	
	// TODO : GetAdvertisementInfo
	
	public Content getAdvertisementInfo(int advertisementId){
		if(advertisementId.exist()){
			 getContent();
		} else {
			return "FALSE";
		}
	}
	
	
	

} // End of Services
