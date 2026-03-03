package org.jsp.oneToMany_bi.dao;

import java.util.List;

import org.jsp.oneToMany_bi.dto.Author;
import org.jsp.oneToMany_bi.dto.Books;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class AuthorBooksDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveAuthor(Author author)
	{
		List<Books> listBooks=author.getBooks();
		for (Books books : listBooks) {
			books.setAuthor(author);
		}
		transaction.begin();
		manager.persist(author);
		transaction.commit();
	}
	public void saveBooks(List<Books> books)
	{
		
		for (Books books2 : books) {
			transaction.begin();
			manager.persist(books2);
			transaction.commit();
		}
		
	}
	
	public void updateAuthor(Author author)
	{
		transaction.begin();
		manager.merge(author);
		transaction.commit();
	}
	public void updateBooks(List<Books> books)
	{
		for (Books book : books) {
			transaction.begin();
			manager.merge(book);
			transaction.commit();
		}
	}
	
	public void findAuthor(int aid)
	{
		Author author=manager.find(Author.class, aid);
		if(author!=null)
		{
			System.out.println(author);
		}
		else
		{
			System.out.println("Author is Not found");
		}
	}
	
	public void findBooks(int bid)
	{
		Books books=manager.find(Books.class, bid);
		if(books != null)
		{
			System.out.println(books);
		}
		else
		{
			System.out.println("Books is Not Found");
		}
	}
	
	public void deleteAuthor(int aid)
	{
		Author author=manager.find(Author.class, aid);
		if(author != null)
		{
			transaction.begin();
			manager.remove(author);
			transaction.commit();
		}
		else
		{
			System.out.println("Author is not found And not deleted");
		}
	}
	
	public void deleteBooks(int bid)
	{
		Books books=manager.find(Books.class, bid);
		if(books != null)
		{
			
			transaction.begin();
			manager.remove(books);
			transaction.commit();
		}
		else
		{
			System.out.println("Book is Not Found And Not Deleted");
		}
	}
	
	public void findAllAuthor()
	{
		Query query=manager.createQuery("select a from Author a");
		List<Author> authors=query.getResultList();
		for (Author author : authors) {
			System.out.println(author);
		}
	}
	
	public void findAllBooks()
	{
		Query query=manager.createQuery("select b from Books b");
		List<Books> books=query.getResultList();
		for (Books books2 : books) {
			System.out.println(books2);
		}
	}
	
	public void deletedById(int bid,List<Books> books)
	{
		Books books2=manager.find(Books.class, bid);
		if(books2 != null)
		{
			books2.setAuthor(null);
			transaction.begin();
			manager.remove(books2);
			transaction.commit();
		}
	}
	
	public void addToWriteBooks(int aid,List<Books> books)
	{
		Author author=manager.find(Author.class, aid);
		if(author != null)
		{
			List<Books> dblistBooks=author.getBooks();
			if(dblistBooks != null)
			{
				dblistBooks.addAll(books);
				transaction.begin();
				manager.merge(author);
				transaction.commit();
			}
			else
			{
				author.setBooks(books);
				transaction.begin();
				manager.merge(author);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Author Id is Not Found...");
		}
	}
	
}
