package org.jsp.oneToMany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.oneToMany_bi.dao.AuthorBooksDao;
import org.jsp.oneToMany_bi.dto.Author;
import org.jsp.oneToMany_bi.dto.Books;

public class AuthorBooksController
{
	public static void main(String[] args) {
		
		Author author=new Author();
		author.setAid(6);
		author.setName("Raj");
		author.setAddress("Dhone");
		author.setContact(1111111111l);
		
		List<Books> listbooks=new ArrayList<Books>();
		
		Books book1=new Books();
		book1.setBid(116);
		book1.setName("Jsp");
		book1.setCost(643);
		
		Books book2=new Books();
		book2.setBid(117);
		book2.setName("Servlet");
		book2.setCost(821);
		
		Books book3=new Books();
		book3.setBid(118);
		book3.setName("Spring");
		book3.setCost(326);
		
		
		listbooks.add(book1);
		listbooks.add(book2);
		listbooks.add(book3);
		
//		in case of case:3 this method open and in case of Case:4 comment this one
		author.setBooks(listbooks);
		
//		book1.setAuthor(author);
//		book2.setAuthor(author);
//		book3.setAuthor(author);
		
//		in case of case:4 this method open and in case of Case:3 comment this one
		for (Books books : listbooks) {
			books.setAuthor(author);
		}
//		
		
		AuthorBooksDao dao=new AuthorBooksDao();
//	case 1: Author Has Books And Books Has Author
//		dao.saveAuthor(author);
		
//		Case 2: Books Has Author And Author Has Books
//		dao.saveBooks(listbooks);
		
//	case 3: Author Has Books but Books Does not Have Author
		
//		dao.saveAuthor(author);
		
//	Case 4 Books Has Author And Author Does not Have Books
//		dao.saveBooks(listbooks);
		
//		Update
		
//		dao.updateAuthor(author);
//		dao.updateBooks(listbooks);
		
//		Find
//		dao.findAuthor(1);
//		dao.findBooks(101);
		
//		Delete
//		dao.deleteAuthor(6);
//		dao.deleteBooks(111);
		
//		FindALL
//		dao.findAllAuthor();
//		dao.findAllBooks();
		
//		dao.deletedById(112, listbooks);
		
		dao.addToWriteBooks(2, listbooks);
	}

}
