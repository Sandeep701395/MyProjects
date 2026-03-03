 package org.jsp.onetoone_bi.controller;

import org.jsp.onetoone_bi.dao.BikeEngineDao;
import org.jsp.onetoone_bi.dto.Bike;
import org.jsp.onetoone_bi.dto.Engine;

public class BikeEngineController {
	public static void main(String[] args) {
		
		Engine engine=new Engine();
		engine.setEid(1003);
		engine.setCc("135cc");
		engine.setType("Diseal");
		
		Bike bike=new Bike();
		bike.setBid(103);
		bike.setBrand("Scooty");
		bike.setColor("Yellow");
		
//		Bike Has Engine As Well as Engine Has Bike
//		comment this one in case:3
		engine.setBike(bike);
//		comment this one in case:4
		bike.setEngine(engine);
		
		
		BikeEngineDao dao=new BikeEngineDao();
		// Case 1:Bike Has Engine As Well as Engine Has Bike
		
//		dao.saveBike(bike);
		
		// Case 2:Engine Has Bike As Well as Bike Has Engine
		
//		dao.saveEngine(engine);
		// Case 3:Bike Has Engine But  Engine does Not Have Bike
//		dao.saveBike(bike);
		
//		Case 4:ENgine Has Bike But Bike does not have Engine
		
//		dao.saveEngine(engine);
		
		//2.Update
//		dao.updateBike(bike);
//		dao.updateEngine(engine);
		
//		3.find
//		dao.findBike(101);
//		dao.findEngine(1001);
		
//		4.Delete
//		dao.deleteBike(103);
//		dao.deleteEngine(1003);
		
//		5.Find ALL
//		dao.findAllBikes();
//		dao.findAllEngines();
		
	}

}


// What is joinColumn.
// What is MappedBy
// difference between joinColumn and mappedBy
