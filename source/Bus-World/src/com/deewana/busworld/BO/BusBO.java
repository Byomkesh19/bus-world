package com.deewana.busworld.BO;

import com.deewana.busworld.dao.BusDAO;
import com.deewana.busworld.model.Bus;

public class BusBO {
	
private BusDAO busDAO=new BusDAO();
	

	public int registerBusBO(Bus bus) {
		
		//After registration of bus to the DB it returns the auto generated unique id
		int busId=busDAO.register(bus);
		return busId;
	}


	public Bus getTheBusDetails(int busId) {
		Bus bus=busDAO.getBusDetails(busId);
		return bus;
	}

}
