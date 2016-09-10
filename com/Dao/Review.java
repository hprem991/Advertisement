package com.Dao;
import java.*;
import java.lang.*;
import java.lang.annotation.*;
import java.io.*;

public class Review {
  private int id;
  private int advertisement;
  private String username;
  private String description;
  private String reason;
  private int rating;
  private boolean approval;
  public int getId() {
	  return id;
  }
  
  public void setId(int id) {
	  this.id = id;
  }
  
  public int getAdvertisement() {
	  return advertisement;
  }
  
  public void setAdvertisement(int advertisement) {
	  this.advertisement = advertisement;
  }
  
  public String getUsername() {
	  return username;
  }
  
  public void setUsername(String username) {
	  this.username = username;
  }
  
  public String getDescription() {
	  return description;
  }
  
  public void setDescription(String description) {
	  this.description = description;
  }
  
  public String getReason() {
	  return reason;
  }
  
  public void setReason(String reason) {
	  this.reason = reason;
  }
  
  public int getRating() {
	  return rating;
  }
  
  public void setRating(int rating) {
	  this.rating = rating;
  }
  
  public boolean isApproval() {
	  return approval;
  }
  
  public void setApproval(boolean approval) {
	  this.approval = approval;
  }
} // End of the Review
