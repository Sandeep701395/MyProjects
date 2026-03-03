package org.jsp.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private int cid;
	private String brand;
	private String color;
	private double cost;
	
	@Autowired
	private Engine engine;

	public Car(@Value("10") int cid,@Value("Tata") String brand,@Value("Red") String color,@Value("750000") double cost, Engine engine) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.engine = engine;
	}
	
	public void carDetails()
	{
		System.out.println("Car id:"+cid);
		System.out.println("Car Brand:"+brand);
		System.out.println("Car Color:"+color);
		System.out.println("Car Cost:"+cost);
		engine.engineDetails();
	}
	
}
