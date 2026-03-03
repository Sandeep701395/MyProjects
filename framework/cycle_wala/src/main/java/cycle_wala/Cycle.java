package cycle_wala;

import jakarta.persistence.*;
@Entity
@Table
public class Cycle
{
	@Id
	private int cid;
	private String brand;
	private String color;
	private double cost;
	private String type;
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Cycle [cid=" + cid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + ", type=" + type
				+ "]";
	}
	
	
}
