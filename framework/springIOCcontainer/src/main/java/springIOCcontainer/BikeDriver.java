package springIOCcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BikeDriver {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
//		Bike bike=(Bike) context.getBean("mybike");
//		bike.start();
//		bike.stop();
		
		
//		CORE-CONTAINER
		Resource resource=new ClassPathResource("bike.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Bike bike=(Bike) factory.getBean("mybike");
		bike.start();
		bike.stop();
	}
}
