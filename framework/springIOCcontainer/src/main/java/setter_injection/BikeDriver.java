package setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bike1.xml");
		Bike bike=(Bike) context.getBean("mybike1");
		System.out.println(bike.getBrand());
		System.out.println(bike.getColor());
		System.out.println(bike.getCost());
	}
}
