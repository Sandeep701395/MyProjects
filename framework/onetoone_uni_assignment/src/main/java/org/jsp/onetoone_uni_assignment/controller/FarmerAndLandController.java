package org.jsp.onetoone_uni_assignment.controller;

import org.jsp.onetoone_uni_assignment.dao.FarmerAndLandDao;
import org.jsp.onetoone_uni_assignment.dto.Farmer;
import org.jsp.onetoone_uni_assignment.dto.Land;

public class FarmerAndLandController 
{
	public static void main(String[] args) {
		
		Farmer farmer=new Farmer();
		farmer.setFid(3);
		farmer.setName("Kiran");
		farmer.setVillage("Ppl");
		farmer.setAge(25);
		
		Land land=new Land();
		land.setLid(103);
		land.setSurveyNo(790);
		land.setArea(1.60);
		
		farmer.setLand(land);
		
//		Farmer Has Land
		FarmerAndLandDao dao= new FarmerAndLandDao();
//		1.Insert
//		dao.saveFarmer(farmer);
//		dao.saveLand(land);
		
//		2.Update 
//		dao.updateFarmer(farmer);
//		dao.updateLand(land);
//		
//		3.FInd
//		dao.findFarmer(2);
//		dao.findLand(101);
		
//		4.Delete
//		dao.deleteFarmer(3);
//		dao.deleteLand(104);
		
//		dao.findAllFarmer();
//		dao.findAllLand();
		
		
		
		
	}

}
