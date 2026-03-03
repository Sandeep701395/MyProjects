package org.jsp.onetoone_uni.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int mid;
	private String brand;
	private String color;
	private double cost;
	
	@OneToOne(cascade = CascadeType.ALL)
//	what is cascade and explain its types
	private Os os;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Os getOs() {
		return os;
	}

	public void setOs(Os os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + ", os=" + os + "]";
	}
	
	
	

}
