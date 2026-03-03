package org.jsp.bus_wala.controller;

import org.jsp.bus_wala.dao.BusDao;
import org.jsp.bus_wala.dto.Bus;

public class BusController 
{
	public static void main(String[] args) 
	{
		Bus bus=new Bus();
		bus.setBid(13);
		bus.setBrand("AshokLayland");
		bus.setColor("Blue");
		bus.setCost(1200000);
		
		BusDao busDao=new BusDao();
//		busDao.saveBus(bus);
//		busDao.updateBus(bus);
//		busDao.findBus(11);
//		busDao.deleteBus(12);
		busDao.findAllBuses();
	}

}
