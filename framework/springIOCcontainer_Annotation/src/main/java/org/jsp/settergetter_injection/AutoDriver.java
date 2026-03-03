package org.jsp.settergetter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myappconfig.xml");
		Auto auto=context.getBean(Auto.class);
		System.out.println(auto);
	}
}
