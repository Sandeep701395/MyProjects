package setter_injection_using_has_a_relationship;

public class Car {

	private int cid;
	private String brand;
	private String color;
	private double cost;
	
	private Engine engine;

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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", brand=" + brand + ", color=" + color + ", cost=" + cost + ", engine=" + engine
				+ "]";
	}
	
	
}
