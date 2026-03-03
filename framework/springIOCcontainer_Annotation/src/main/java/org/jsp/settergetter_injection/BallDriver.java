package org.jsp.settergetter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BallDriver {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("myapplicationconfig.xml");
		Ball ball=context.getBean(Ball.class);
		ball.ballDetails();
		
	}
}
