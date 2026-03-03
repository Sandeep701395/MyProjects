package setter_injection_using_has_a_relationship;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_EngineDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("car_engine1.xml");
		Car car=(Car) context.getBean("mycar");
		System.out.println(car);
		
	}
}
