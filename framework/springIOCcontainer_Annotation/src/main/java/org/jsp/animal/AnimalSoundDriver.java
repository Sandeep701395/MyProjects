package org.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalSoundDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		AnimalSound animalSound=context.getBean(AnimalSound.class);
		animalSound.doSound();
	}
}
