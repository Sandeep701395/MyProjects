package org.jsp.oneToMany_uni_assign.controller;


import java.util.ArrayList;
import java.util.List;

import org.jsp.oneToMany_uni_assign.dao.LibraryBookDao;
import org.jsp.oneToMany_uni_assign.dto.Book;
import org.jsp.oneToMany_uni_assign.dto.Library;

public class LibraryBookController {

	public static void main(String[] args) {
		
		Library library= new Library();
		library.setLid(102);
		library.setName("State");
		library.setLocation("ATP");
		
		List<Book> books=new ArrayList<Book>();
		
		Book book1=new Book();
		book1.setBid(3);
		book1.setTitle("Sql");
		book1.setAuthor("codd");
		book1.setCost(670);
		
		Book book2=new Book();
		book2.setBid(4);
		book2.setTitle("Css");
		book2.setAuthor("Lee");
		book2.setCost(800);
		
		books.add(book1);
		books.add(book2);
		
		library.setBook(books);
		
		LibraryBookDao dao=new LibraryBookDao();
//		dao.saveLibrary(library);
		
//		dao.saveBooks(books);
//		dao.updateLibrary(library);
//		dao.updateBooks(books);
		
//		dao.findLibrary(102);
//		dao.findBooks(3);

//		dao.deleteLibrary(102);
//		dao.deleteBook(2);
		
//		dao.addToReadLater(101, books);
		dao.removeFromBookAfterReading(101, 4);
	}
}
