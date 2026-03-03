package constructor_injection_has_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("book.xml");
		Book book=(Book) context.getBean("mybook");
//		book.bookDetails();
		System.out.println(book);
	}
}
