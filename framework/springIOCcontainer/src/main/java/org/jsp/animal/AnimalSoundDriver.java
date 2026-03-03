package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSoundDriver {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("animal.xml");
		AnimalSound animal=(AnimalSound) context.getBean("myanimalsound");
		animal.doSound();
		
		
		
		
	}
}
