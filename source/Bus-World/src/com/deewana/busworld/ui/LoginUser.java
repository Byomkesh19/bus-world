package com.deewana.busworld.ui;

import java.util.Scanner;

import com.deewana.busworld.BO.UserBO;
import com.deewana.busworld.model.User;

public abstract class LoginUser {
	private static Scanner sc=new Scanner(System.in);
	UserBO userBO=new UserBO();
	public abstract void login();
	
	public void registerUser(){
		//Taking the input from user
		//The input will be taken from the UI directly once the application develops
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.nextLine();
		System.out.println("Enter Email ID");
		String emailID=sc.nextLine();
		System.out.println("Enter Contact Number");
		int contactNumber=sc.nextInt();
		System.out.println("Enter Password");
		String password=sc.nextLine();
		System.out.println("Enter user Type");
		String userType=sc.nextLine();
		
		//Setting the value of the user into the User object
		User user=new User();
		user.setName(name);
		user.setAddress(address);
		user.setContactNumber(contactNumber);
		user.setEmailID(emailID);
		user.setPassword(password);
		user.setUserType(userType);
		user.setLocation(address);
		
		//Registering the data into the DB,post which an auto-generated Unique ID will be generated
		int userId=userBO.registerUserBO(user);
		user.setUserId(userId);
	}
	

	public int performLogin(){
		System.out.println("Enter User ID");
		int userId=sc.nextInt();
		System.out.println("Enter password");
		String expectedPassword=sc.nextLine();
		
		//If the entered userName and password matches the one while registering then login will happen
		if(userBO.validateUser(userId, expectedPassword)){
			//The user will be redirected to the Homepage on successful login and a session will be created
			//For now resembling it with sysout statements
			System.out.println("Welcome to the Bus World!!!");
			return userId;
			
		}
		else{
			System.out.println("Incorrect Credentials");
			return -1;
		}
		
	}
}
