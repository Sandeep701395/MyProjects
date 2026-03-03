package bike_wala;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table
public class Bike 
{
	@Id
	private int bid;
	private String brand;
	private String color;
	private double cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
	
	
}
