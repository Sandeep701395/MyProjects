package constructor_injection_has_a_relationship;

public class Laptop {

	private int lid;
	private String brand;
	private double cost;
	public Laptop(int lid, String brand, double cost) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.cost = cost;
	}
	
	public void laptopDetails()
	{
		System.out.println("Laptop Id Is:"+lid);
		System.out.println("Laptop Brand is:"+brand);
		System.out.println("Laptop Cost is:"+cost);
		
	}
}
