 package constructor_injection;

public class Ball {

	private String brand;
	private String color;
	private double cost;
	private String shape;
	public Ball(String brand, String color, double cost, String shape) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.shape = shape;
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
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public void ballDetails()
	{
		System.out.println("Ball Brand is:"+getBrand());
		System.out.println("Ball Color is:"+getColor());
		System.out.println("Ball Cost  is:"+getCost());
		System.out.println("Ball Shape is:"+getShape());
	}
}
