package constructor_injection_has_a_relationship;

public class Mobile {

	private int mid;
	private String brand;
	private String color;
	
	
	public Mobile(int mid, String brand, String color) {
		super();
		this.mid = mid;
		this.brand = brand;
		this.color = color;
	}
	
	public void mobileDetails()
	{
		System.out.println("Mobile id is:"+mid);
		System.out.println("MObile Brand is:"+brand);
		System.out.println("MObile Color is:"+color);
		System.out.println("==========================");
	}
	
}
