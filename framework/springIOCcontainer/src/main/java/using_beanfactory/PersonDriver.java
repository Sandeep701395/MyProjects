package using_beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonDriver {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("person.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Person person=(Person) factory.getBean("myperson");
		person.personDetails();
	}
}
