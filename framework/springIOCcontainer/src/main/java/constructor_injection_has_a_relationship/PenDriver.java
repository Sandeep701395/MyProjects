package constructor_injection_has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen=(Pen) context.getBean("mypen");
		pen.penDetails();
	}
}
