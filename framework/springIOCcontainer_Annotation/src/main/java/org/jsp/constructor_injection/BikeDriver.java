package org.jsp.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		Bike bike=(Bike) context.getBean("bike");
		bike.bikeDetails();
	}
}
