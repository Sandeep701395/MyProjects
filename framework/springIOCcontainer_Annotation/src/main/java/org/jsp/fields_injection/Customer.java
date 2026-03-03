package org.jsp.fields_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("1")
	private int cid;
	@Value("Nandi")
	private String name;
	@Value("25")
	private int age;
	@Value("Rayachoty")
	private String address;
	@Autowired
	private Products products;
	
	
	public void customerDetails()
	{
		System.out.println("Customer Id:"+cid);
		System.out.println("Customer Name:"+name);
		System.out.println("Customer Age:"+age);
		System.out.println("Customer Address:"+address);
		products.productDetails();
	}
}
