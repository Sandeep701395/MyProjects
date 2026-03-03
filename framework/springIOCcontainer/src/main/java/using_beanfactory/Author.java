package using_beanfactory;

import java.util.Iterator;
import java.util.List;

public class Author {

	private String name;
	private int age;
	private String address;
	private String gender;
	
	private List<Book> books;

	public Author(String name, int age, String address, String gender, List<Book> books) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.books = books;
	}
	
	public void authorDetails()
	{
		System.out.println("Author Name:"+name);
		System.out.println("Author Age"+age);
		System.out.println("Author Address:"+address);
		System.out.println("Author Gender:"+gender);
		for (Book book : books) {
			book.bookDetails();
		}
	}
}
