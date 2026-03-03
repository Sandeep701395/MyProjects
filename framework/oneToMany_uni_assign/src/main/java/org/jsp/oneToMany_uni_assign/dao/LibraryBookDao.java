package org.jsp.oneToMany_uni_assign.dao;



import java.util.List;

import org.jsp.oneToMany_uni_assign.dto.Book;
import org.jsp.oneToMany_uni_assign.dto.Library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LibraryBookDao 
{
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	
	public void saveLibrary(Library library) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(library);
		transaction.commit();
	}
	public void saveBooks(List<Book> books) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		for (Book book : books) {
			transaction.begin();
			manager.persist(book);
			transaction.commit();
		}
	}
	
	public void updateLibrary(Library library) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(library);
		transaction.commit();
	}

	public void updateBooks(List<Book> book)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		for (Book book2 : book) {
			transaction.begin();
			manager.merge(book2);
			transaction.commit();
		}
	}
	
	public void findLibrary(int lid) {
		EntityManager manager=getEntityManager();
		Library library=manager.find(Library.class, lid);
		if(library!=null)
		{
			System.out.println(library);
		}
		else
		{
			System.out.println("Library is Not Found");
		}
	}
	
	public void findBooks(int bid)
	{
		EntityManager manager=getEntityManager();
		Book book=manager.find(Book.class, bid);
		if(book != null)
		{
			System.out.println(book);
		}
		else {
			System.out.println("Book is Not Found");
		}
	}
	
	public void deleteLibrary(int lid)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Library library=manager.find(Library.class, lid);
		if(library!=null)
		{
			transaction.begin();
			manager.remove(library);
			transaction.commit();
		}
		else
		{
			System.out.println("Library is Not Deleted");
		}
	}
	
	public void deleteBook(int bid)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Book book=entityManager.find(Book.class, bid);
		if(book != null)
		{
			transaction.begin();
			entityManager.remove(book);
			transaction.commit();
		}
		else
		{
			System.out.println("Book Is not Deleted");
		}
	}
	public void addToReadLater(int lid,List<Book> listBooks)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Library library=manager.find(Library.class, lid);
		if(library != null)
		{
			List<Book> books=library.getBook();
			if(books != null)
			{
				books.addAll(listBooks);
				transaction.begin();
				manager.merge(library);
				transaction.commit();
			}
			else
			{
				library.setBook(listBooks);
				transaction.begin();
				manager.merge(library);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Library Id Is Not Found");
		}
	}
	
	public void removeFromBookAfterReading(int lid,int bid)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Library library=manager.find(Library.class, lid);
		Book book=manager.find(Book.class, bid);
		if(library != null && book != null)
		{
			List<Book> dbBooks=library.getBook();
			if(dbBooks.contains(book))
			{
				dbBooks.remove(book);
				transaction.begin();
				manager.merge(book);
				transaction.commit();
			}
			else
			{
				System.out.println("Book Is Not Added To Library");
			}
		}
		else
		{
			System.out.println("lid or bid is Not Found");
		}
	}
}
