package chai_wala;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Chai {
	@Id
	private int cid;
	private String type;
	private double cost;
	private double milkQuantity;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getMilkQuantity() {
		return milkQuantity;
	}
	public void setMilkQuantity(double milkQuantity) {
		this.milkQuantity = milkQuantity;
	}
	@Override
	public String toString() {
		return "Chai [cid=" + cid + ", type=" + type + ", cost=" + cost + ", milkQuantity=" + milkQuantity + "]";
	}
	
	
	
	
}
