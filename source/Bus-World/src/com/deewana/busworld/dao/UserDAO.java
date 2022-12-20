package com.deewana.busworld.dao;

import com.deewana.busworld.model.User;

public class UserDAO {

	public String getActualPassword(int userId){
		//Code to call the DB and get the user ID and password
		String actualPassword="Bus-World Project";//to be fetched from DB;
		return actualPassword;
	}

	public int register(User user) {
		//Code to register the user to the DB once
		//Code
		
		int userId=12345;//In Actual fetched from the DB
		return userId;
	}

	public User getUser(int userId) {
		//Code to get the user details from the db;
		User user=new User();
		user.setAddress("Asansol");
		user.setUserId(12345);
		user.setName("BusTest");
		//also set the other fields
		return user;
	}
}
