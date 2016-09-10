package com.Dao;
import java.io.*;
import java.lang.*;
import java.lang.annotation.*;

public class Email {
	private int id;
	private String email;
	private boolean verified;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
} // End of the Email
