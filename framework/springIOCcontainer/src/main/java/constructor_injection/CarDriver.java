package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springIOCcontainer.Car;

public class CarDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("car_engine.xml");
		Car1 car=(Car1) context.getBean("mycar1");
		System.out.println(car);
	}
}
