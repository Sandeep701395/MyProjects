package org.jsp.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("vehicle.xml");
		VehicleStart start=(VehicleStart) context.getBean("myvehicle");
		start.doStart();
	}
}
