package setter_injection_using_has_a_relationship;

public class Mobile {

	private String brand;
	private String color;
	private double cost;
	
	private Battery battery;

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

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", cost=" + cost + ", battery=" + battery + "]";
	}
	
	
}
