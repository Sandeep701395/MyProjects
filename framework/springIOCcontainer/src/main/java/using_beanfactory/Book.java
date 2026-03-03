package using_beanfactory;

public class Book {

	private String name;
	private double cost;
	private int pages;
	private int year;
	public Book(String name, double cost, int pages, int year) {
		super();
		this.name = name;
		this.cost = cost;
		this.pages = pages;
		this.year = year;
	}
	
	public void bookDetails()
	{
		System.out.println("Book Name:"+name);
		System.out.println("Book Cost:"+cost);
		System.out.println("Book Pages:"+pages);
		System.out.println("Book published year:"+year);
	}
}
