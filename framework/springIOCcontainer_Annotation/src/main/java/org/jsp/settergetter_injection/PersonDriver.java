package org.jsp.settergetter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		Person person=context.getBean(Person.class);
		
		System.out.println(person);
		context.close();
	}
}
