package constructor_injection;

public class Marker {

	private String brand;
	private String color;
	private double cost;
	public Marker(String brand, String color, double cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
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



	public void markerDetails()
	{
		System.out.println("Brand is :"+getBrand());
		System.out.println("Color is :"+getColor());
		System.out.println("Cost is  :"+getCost());
	}
}
