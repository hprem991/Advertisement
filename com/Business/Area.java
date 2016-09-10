package com.Business;
import java.lang.*;

public class Area {	
	
	private double latitute;
	private double longtitute;
	private double range;
	
	Area(double latitute, double longitude, int range, String rangeType){
		if(rangeType ==  "MI")
			this.range = range * 1.6;// Convert Everything to Kilometers
		else 
			this.range = range;
		
		this.latitute = latitute;
		this.longtitute = longtitute;
	  
	}
	
	// This Method should return the Circle with latitute and longtitute as center
	// NOTE :- This is currently parked as we won't have enough advertiser initially and circle will remove some of them
	//         Plus, this appears to be a secondary check required to verify if the co-ordinate lies within the circle
	//         as the circle only have radius and center point.
	
	public double calculateArea(int radius){ 
		return (22 / 7) * radius;
	}
	
	public double getMaxLong(){
		return this.longtitute + this.range;
	}
	
	public double getMaxLat(){
		 return this.latitute + this.range;
	}
	
	public double getMinLong(){
		return this.longtitute + this.range;
	}
	
	public double getMinLat(){
		return this.latitute + this.range;
	}
} // End of Area
