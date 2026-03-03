package org.jsp.compositeKey2.controller;

import org.jsp.compositeKey2.dao.BookDao;
import org.jsp.compositeKey2.dto.Book;
import org.jsp.compositeKey2.dto.BookId;

public class BookController {

	public static void main(String[] args) {
		
		Book book=new Book();
		book.setName("Html");
		book.setAuthor("Lee");
		book.setPublisher("Pearson");
		
		BookId bookId=new BookId();
		bookId.setCost(800);
		bookId.setEdition(1);
		
		book.setBookId(bookId);
		
		BookDao dao=new BookDao();
		dao.saveBook(book);
//		dao.updateBook(bookId, book);
//		dao.findBook(bookId);
//		dao.deleteBook(bookId);
//		dao.findAllBooks();
	}
}
