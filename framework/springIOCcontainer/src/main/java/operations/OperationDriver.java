package operations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OperationDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("add.xml");
		Operation operation=(Operation) context.getBean("operation");
		//1
		System.out.println("Addition is: "+operation.add(23, 90));
		//2
		operation.sub(543, 300);
		//3
		if(operation.mul(20, 10)==300)
		{
			System.out.println("Answer is correct...");
		}
		else
			System.out.println("Answer is wrong....");
		//4
		int d=operation.div(1000, 10);
		System.out.println("Division is: "+d);
	}
}
