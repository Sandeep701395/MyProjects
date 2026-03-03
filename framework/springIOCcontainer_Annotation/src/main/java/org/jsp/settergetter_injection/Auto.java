package org.jsp.settergetter_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Auto {

	private int aid;
	private String brand;
	private String color;
	private double cost;
	

	public int getAid() {
		return aid;
	}

	@Value("1")
	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getBrand() {
		return brand;
	}

	@Value("Tata")
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}

	@Value("Yellow")
	public void setColor(String color) {
		this.color = color;
	}


	public double getCost() {
		return cost;
	}

	@Value("350000")
	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Auto [aid=" + aid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
}
