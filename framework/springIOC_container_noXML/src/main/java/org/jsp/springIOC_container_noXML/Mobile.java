package org.jsp.springIOC_container_noXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private int mid;
	private String brand;
	private String color;
	private double cost;
	@Autowired
	private Battery battery;

	public int getMid() {
		return mid;
	}
	@Value(value = "100")
	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getBrand() {
		return brand;
	}
	@Value(value = "Vivo")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}
	@Value(value = "Blue")
	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}
	@Value(value = "16500")
	public void setCost(double cost) {
		this.cost = cost;
	}

	public Battery getBattery() {
		return battery;
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + ", battery="
				+ battery + "]";
	}
	
	
	
}
