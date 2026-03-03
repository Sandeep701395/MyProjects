package setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HostelDriver {

	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("hostel.xml");
		Hostel hostel=(Hostel) context.getBean("myhostel");
		System.out.println(hostel.getHid());
		System.out.println(hostel.getName());
		System.out.println(hostel.getAddress());
	}
}
