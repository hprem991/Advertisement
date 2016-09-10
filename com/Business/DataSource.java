package com.Business;

import com.Dao.*;
import org.hibernate.HibernateException; 
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class DataSource {

	public static SessionFactory factory;
	public DataSource(){
		try {
			Configuration conf =  null;
			try{
				conf = new Configuration();
				System.out.println("Configuration Done");
			} catch (Exception e){
				System.out.println("Configuratin Exception "+e);
			}
		   factory =  conf.configure().buildSessionFactory();	
		} catch(Exception e){
			System.out.println("Failed to create a session factory " +e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
}
