package org.jsp.onetoone_bi.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	
	@Id
	private int bid;
	private String brand;
	private String color;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Engine engine;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", brand=" + brand + ", color=" + color + ", engine=" + engine + "]";
	}
	
	

}
