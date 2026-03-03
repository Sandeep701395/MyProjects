package constructor_injection_has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("student_mobile_laptop.xml");
		Student student=(Student) context.getBean("mystudent");
		student.studentDetails();
		
	}
}
