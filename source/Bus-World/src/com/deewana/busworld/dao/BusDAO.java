package com.deewana.busworld.dao;

import com.deewana.busworld.model.Bus;

public class BusDAO {

	public int register(Bus bus) {
		
		//Code to register the Bus to the DB once
		//Code
				
		int busId=2275;//In Actual fetched from the DB
		return busId;
	}

	public Bus getBusDetails(int busId) {
		//Code to fetch all the bus details from the DB using the key busId;
		
		//In actual the data will be fetched from the db
		Bus bus=new Bus();
		bus.setName("Tata");
		bus.setSource("Asansol");
		bus.setDestination("Kolkata");
		bus.setOwnerId(12345);
		
		return bus;
	}

}
