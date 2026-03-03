package using_beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AuthorBookDriver {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("author_book.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Author author=(Author) factory.getBean("myauthor");
		author.authorDetails();
	}
}
