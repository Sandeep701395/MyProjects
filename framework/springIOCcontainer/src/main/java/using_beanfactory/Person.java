package using_beanfactory;

public class Person {

	private String name;
	private int age;
	private String address;
	private String gender;
	
	
	
	public Person(String name, int age, String address, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}



	public void personDetails()
	{
		System.out.println("Person Name:"+name);
		System.out.println("Person Age:"+age);
		System.out.println("Person Address:"+address);
		System.out.println("Person Gender:"+gender);
	}
}
