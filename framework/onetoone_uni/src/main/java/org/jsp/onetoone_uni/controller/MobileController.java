package org.jsp.onetoone_uni.controller;

import org.jsp.onetoone_uni.dao.MobileOsDao;
import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

public class MobileController 
{
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		mobile.setMid(101);
		mobile.setBrand("OnePlus");
		mobile.setColor("Black");
		mobile.setCost(55000);
		
		Os os=new Os();
		os.setOsId(1001);
		os.setName("Android5");
		os.setBit(256);
	
//		Mobile Has Os
		mobile.setOs(os);
		
		MobileOsDao dao=new MobileOsDao();
//		1.Insert
		
//		dao.saveMobile(mobile);
		
//		2.Update
//		dao.updateMobile(mobile);
//		dao.updateOs(os);
		
//		3.Find
//		dao.findMobile(101);
		
//		4.Delete
//		dao.removeMobile(105);
//		dao.removeOs(1005);
		
//		5.FindAll
//		dao.findAllMobile();
		dao.findAllOs();

	}

}
