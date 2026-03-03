package org.jsp.constructor_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	private int bid;
	private String brand;
	private String color;
	private double cost;
	public Bike(@Value("1") int bid,@Value("Hero") String brand,@Value("Red") String color,@Value("98000") double cost) {
		super();
		this.bid = bid;
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	public void bikeDetails()
	{
		System.out.println("Bike Id :"+bid);
		System.out.println("Bike Brand :"+brand);
		System.out.println("Bike Color :"+color);
		System.out.println("Bike Cost:"+cost);
	}
	
}
