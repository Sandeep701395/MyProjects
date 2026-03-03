package org.jsp.compositeKey.controller;

import org.jsp.compositeKey.dao.AmazoneDao;
import org.jsp.compositeKey.dto.Amazone;
import org.jsp.compositeKey.dto.AmazoneId;

public class AmazoneController {

	public static void main(String[] args) {
		
		Amazone amazone=new Amazone();
		amazone.setName("Ranga");
		amazone.setAddress("Kadapa");
		amazone.setPassword("ranga@123");
		
		AmazoneId amazoneId=new AmazoneId();
		amazoneId.setEmail("sandeep@gmail.com");
		amazoneId.setMobileNo(9999999999l);
		
		amazone.setAmazoneId(amazoneId);
		
		
		AmazoneDao dao=new AmazoneDao();
//		dao.saveAmazone(amazone);
		
//		dao.updateAmazone(amazoneId, amazone);
		
//		dao.findAmazone(amazoneId);
		
//		dao.deleteAmazone(amazoneId);
		
//		dao.findAllAmazone();
		
	}
}
