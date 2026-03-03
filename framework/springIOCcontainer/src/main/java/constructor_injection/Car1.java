package constructor_injection;

public class Car1 {

	private String brand;
	private String color;
	private double cost;
	
	private Engine engine;

	public Car1(String brand, String color, double cost, Engine engine) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.engine = engine;
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
		return "Car1 [brand=" + brand + ", color=" + color + ", cost=" + cost + ", engine=" + engine + "]";
	}

	
	
	
}
