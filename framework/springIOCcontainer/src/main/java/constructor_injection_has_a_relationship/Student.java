package constructor_injection_has_a_relationship;

public class Student {

	private int sid;
	private String name;
	private int age;
	
	private Mobile mobile;
	private Laptop laptop;
	public Student(int sid, String name, int age, Mobile mobile, Laptop laptop) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.laptop = laptop;
	}
	
	public void studentDetails()
	{
		System.out.println("Student id is:"+sid);
		System.out.println("Student Name is:"+name);
		System.out.println("Student age is:"+age);
		if(mobile != null)
		{
			mobile.mobileDetails();
		}
		if(laptop != null)
		{
			laptop.laptopDetails();
		}
		
		System.out.println("--------------------------");
	}
}
