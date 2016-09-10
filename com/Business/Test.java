package com.Business;
import com.Dao.*;

/*import java.lang.*;
import java.lang.annotation.*;
import org.hibernate.*;
import java.util.*;
import org.hibernate.annotations.*;
import org.hibernate.cfg.*; */

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException; 
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

import com.Dao.Login;

//public class Test {
//	public static SessionFactory factory;
//	
//	public static void main(String a[]){
//	 try{
//		Configuration cnf =  null;
//		try {
//			cnf = new Configuration();
//			System.out.println("Configuration Done !!!");
//		    } catch(Exception e){
//		    	System.out.println("Configuration Exception "+e);
//		    }
//		factory = cnf.configure().buildSessionFactory();
//	  } catch (Exception e) {
//		 System.out.println("Failed to create a session factory "+e);  
//		 throw new ExceptionInInitializerError(e);
//	   }
//
//	Test test = new Test();
//	if(test.addLogin("Prem","Chettri"))
//		System.out.println("Data Added !!!"); 
//	else
//		System.out.println("Failed to Add Data !!!"); 
//    } 
//	
//	public boolean addLogin(String username,String password) {
//		Session session = factory.openSession();
//		Transaction trans = null;
//		Integer id = null;
//		try {
//			 trans = session.beginTransaction();
//			 Login log = new Login();
//			 log.setUsername(username);
//			 log.setPassword(password);
//			 id = (Integer)session.save(log);
//			 trans.commit();
//			 return true; 
//		} catch (Exception e) {
//			System.out.println("Error in Saving Data " +e);
//			return false;
//		}
//	}
//	
//}
