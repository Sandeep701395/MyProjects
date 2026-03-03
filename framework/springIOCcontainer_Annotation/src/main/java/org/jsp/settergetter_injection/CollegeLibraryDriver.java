package org.jsp.settergetter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeLibraryDriver {

	public static void main(String[] args) {
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		College college=context.getBean(College.class);
		System.out.println(college);
	}
}
