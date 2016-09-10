package com.Dao;
import java.lang.*;
import java.io.*;


public class Advertisement {
   private int id;
   private double longititute;
   private double latitute;
   private String time;
   
   public int getId() {
	   return id;
   }
   
   public void setId(int id) {
	   this.id = id;
   }
   
   public double getLongititute() {
	   return longititute;
   }
   
   public void setLongititute(double longititute) {
	   this.longititute = longititute;
   }
   
   public double getLatitute() {
	   return latitute;
   }
   
   public void setLatitute(double latitute) {
	   this.latitute = latitute;
   }
   
   public String getTime() {
	   return time;
   }
   
   public void setTime(String time) {
	   this.time = time;
   }   
} // End of Advertisement
