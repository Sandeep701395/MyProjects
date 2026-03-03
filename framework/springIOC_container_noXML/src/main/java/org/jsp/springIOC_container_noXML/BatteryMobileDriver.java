package org.jsp.springIOC_container_noXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BatteryMobileDriver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		Mobile mobile=context.getBean(Mobile.class);
		System.out.println(mobile);
	}
}
