package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BallDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ball.xml");
		Ball ball=(Ball) context.getBean("myball");
		ball.ballDetails();
		
	}
}
