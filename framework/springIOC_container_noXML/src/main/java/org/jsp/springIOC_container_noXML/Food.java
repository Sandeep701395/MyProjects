package org.jsp.springIOC_container_noXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Food {

	private String name;
	private double cost;
	private int quantity;
	
	public String getName() {
		return name;
	}
	@Value(value = "chicken")
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	@Value(value = "149")
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	@Value(value = "10")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
	}
	
	
}
