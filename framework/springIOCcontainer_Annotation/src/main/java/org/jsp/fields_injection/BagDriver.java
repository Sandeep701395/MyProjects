package org.jsp.fields_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BagDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		Bag bag=context.getBean(Bag.class);
		bag.bagDetails();
	}
}
