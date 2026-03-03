package org.jsp.fields_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bag {
	@Value(value = "10")
	private int bid;
	@Value(value = "Puma")
	private String brand;
	@Value(value = "499")
	private double cost;
	@Value(value = "13")
	private int quantity;
	
	public void bagDetails()
	{
		System.out.println("Bag Id:"+bid);
		System.out.println("Bag Brand:"+brand);
		System.out.println("Bag Cost:"+cost);
		System.out.println("Bag Quantity:"+quantity);
	}
}
