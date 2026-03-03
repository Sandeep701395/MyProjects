package org.jsp.compositeKey2.dao;



import java.util.List;

import org.jsp.compositeKey2.dto.Book;
import org.jsp.compositeKey2.dto.BookId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BookDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveBook(Book book)
	{
		transaction.begin();
		manager.persist(book);
		transaction.commit();
	}
	
	public void updateBook(BookId bookId,Book book)
	{
		Book book2=manager.find(Book.class, bookId);
		if(book2 != null)
		{
			book2.setName(book.getName());
			book2.setAuthor(book.getAuthor());
			book2.setPublisher(book.getPublisher());
			
			transaction.begin();
			manager.merge(book2);
			transaction.commit();
		}
		
	}
	
	public void findBook(BookId bookId)
	{
		Book book=manager.find(Book.class, bookId);
		if(book != null)
		{
			System.out.println(book);
		}
		else
		{
			System.out.println("Book is Not Found");
		}
	}
	
	public void deleteBook(BookId bookId)
	{
		Book book=manager.find(Book.class, bookId);
		if(book != null)
		{
			transaction.begin();
			manager.remove(book);
			transaction.commit();
		}
		else
		{
			System.out.println("Book is not Found...");
		}
	}
	
	public void findAllBooks()
	{
		Query query=manager.createQuery("select b from Book b");
		List<Book> books =query.getResultList();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
