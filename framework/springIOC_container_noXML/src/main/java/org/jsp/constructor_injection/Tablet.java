package org.jsp.constructor_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tablet {

	private int tid;
	private String name;
	private double cost;
	private String exDate;
	
	public Tablet(@Value("1") int  tid,@Value("Paracetamol") String name,@Value("10") double cost,@Value("12-12-2026") String exDate) {
		super();
		this.tid = tid;
		this.name = name;
		this.cost = cost;
		this.exDate = exDate;
	}

	@Override
	public String toString() {
		return "Tablet [tid=" + tid + ", name=" + name + ", cost=" + cost + ", exDate=" + exDate + "]";
	}
	
	
	
}
