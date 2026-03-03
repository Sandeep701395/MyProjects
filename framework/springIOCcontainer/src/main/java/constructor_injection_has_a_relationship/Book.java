package constructor_injection_has_a_relationship;

import java.util.List;

public class Book {

	private List<String> title;
	private List<String> author;
	
	public Book(List<String> title, List<String> author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
//	public void bookDetails()
//	{
//		System.out.println(title);
//		System.out.println(author);
//	}
	
	
}
