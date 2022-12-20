package com.deewana.busworld.ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.deewana.busworld.model.User;


public class CustomerHomePage extends LoginUser{
	private static Scanner sc=new Scanner(System.in);
	int userId;
	@Override
	public void login() {
		System.out.println("Are you already registered ?");
		String alreadyRegistered=sc.next();
		if(alreadyRegistered.equals("Yes")){
			userId=performLogin();
		}
		else{
			registerUser();
			userId=performLogin();
		}
		
	}
	
	public User updateUserLocation(){
		//Updated locagtion comes from the UI
		User user=userBO.getUserDetails(userId);
		System.out.println("Enter the location");
		user.setLocation(sc.nextLine());
		return user;
	}
	
	public List<String> getBusDetails(){
		User user=updateUserLocation();
		List<String> busList=getBusNearToUser(user.getLocation());
		return busList;
	}

	private List<String> getBusNearToUser(String location) {
		List<String> busList=Arrays.asList("Tata","Ashok Leyland");
		return busList;
	}

}
