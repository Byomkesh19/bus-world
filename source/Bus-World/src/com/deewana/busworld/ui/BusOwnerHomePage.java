package com.deewana.busworld.ui;

import java.util.Scanner;

import com.deewana.busworld.BO.BusBO;
import com.deewana.busworld.model.Bus;

public class BusOwnerHomePage extends LoginUser {
	private static Scanner sc = new Scanner(System.in);
	BusBO busBO=new BusBO();
	int userId;
	
	@Override
	public void login() {
		System.out.println("Are you already registered ?");
		String alreadyRegistered = sc.next();
		if (alreadyRegistered.equals("Yes")) {
			userId=performLogin();
		} else {
			registerUser();
			userId=performLogin();
		}
	}

	public void registerBus(int userId) {
		// code to register the bus in the db;
		Bus addedBus=addBusDetails(userId);
		int busId=busBO.registerBusBO(addedBus);
		addedBus.setId(busId);
	}
	
	private Bus addBusDetails(int userId) {

		// Taking the bus details from the user
		// The input will be taken from the UI as the application develops
		System.out.println("Enter the bus name");
		String busName = sc.nextLine();
		System.out.println("Enter source");
		String source = sc.nextLine();
		System.out.println("Enter destination");
		String destination = sc.nextLine();
		int ownerId=userId;

		Bus addedBus = new Bus();
		addedBus.setName(busName);
		addedBus.setSource(source);
		addedBus.setDestination(destination);
		addedBus.setOwnerId(ownerId);
		addedBus.setState(0);//0=Bus is stopeed,1= Bus is started(running)
		addedBus.setLocation("");

		return addedBus;
	}
	
	public void startBus(int busId){
		//In the application notify the system that the bus is started
		Bus bus=busBO.getTheBusDetails(busId);
		bus.setState(1);//bus marked as running
		bus.setLocation(bus.getSource());//As the bus starts the location will be the source
	}
	
	public void stopBus(int busId){
		//In the application notify the system that the bus is stopped
		Bus bus=busBO.getTheBusDetails(busId);
		bus.setState(0);//bus marked as stopped
	}
	
	public void updateBusLocationEvery5Minutes(Bus bus){
		
	}

}
