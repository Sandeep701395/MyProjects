package setter_injection_using_has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileBatteryDriver {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("mobile_battery.xml");
		Mobile mobile=(Mobile) context.getBean("mymobile");
		System.out.println(mobile);
		
	}
	
}
