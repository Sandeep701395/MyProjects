package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerDriver {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("marker.xml");
		Marker marker2=(Marker) context.getBean("mymarker");
		marker2.markerDetails();
		
	}
}
