package org.jsp.settergetter_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ball {

	@Value(value = "Guru")
	private String brand;
	@Value(value = "5")
	private int quantity;
	@Value(value = "circle")
	private String type;
	@Value(value = "small")
	private String size;
	@Value(value = "Red")
	private String color;
	
	public void ballDetails()
	{
		System.out.println("Ball Brand : "+brand);
		System.out.println("Ball Quantity :"+quantity);
		System.out.println("Ball Type :"+type);
		System.out.println("Ball Size :"+size);
		System.out.println("Ball Color :"+color);
	}
}
