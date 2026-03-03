package constructor_injection_has_a_relationship;

import java.util.List;

public class Pen {

	private List<String> brand;
	private double cost;
	
	public Pen(List<String> brand, double cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	
	public void penDetails()
	{
		System.out.println(brand);
		System.out.println(cost);
	}

	
	
}
