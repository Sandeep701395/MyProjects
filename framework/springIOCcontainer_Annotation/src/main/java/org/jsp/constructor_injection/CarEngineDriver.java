package org.jsp.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		Car car=context.getBean(Car.class);
		car.carDetails();
	}
}
