package setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		
//		ApplicationContext  context=new ClassPathXmlApplicationContext("employee.xml");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee) context.getBean("myemployee");
		System.out.println(employee);
		
		context.close();
//		((ClassPathXmlApplicationContext) context).close();
		
	}
}
