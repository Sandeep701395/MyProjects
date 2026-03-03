package org.jsp.fields_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Products {
	@Value("100")
	private int pid;
	@Value("Apple")
	private String name;
	@Value("160")
	private double cost;
	@Value("10")
	private int quantity;
	
	public void productDetails()
	{
		System.out.println("Product Id:"+pid);
		System.out.println("Product Name:"+name);
		System.out.println("Product Cost:"+cost);
		System.out.println("Product Quantity:"+quantity);
	}
}
