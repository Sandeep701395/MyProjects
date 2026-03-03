package org.jsp.onetoone_bi_assign.dao;



import java.util.List;

import org.jsp.onetoone_bi_assign.dto.Library;
import org.jsp.onetoone_bi_assign.dto.University;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UniversityLibraryDao {

	public void saveUniversity(University university) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(university);
		transaction.commit();
	}
	
	public void saveLibrary(Library library) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(library);
		transaction.commit();
	}
	
	public void updateUniversity(University university) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(university);
		transaction.commit();
	}
	
	public void updateLibrary(Library library) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(library);
		transaction.commit();
	}
	
	public void findUniversity(int uid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		University university=manager.find(University.class, uid);
		if(university!=null)
		{
			System.out.println(university);
		}
		else
		{
			System.out.println("University is  Not Found!!!");
		}
	}
	
	public void findLibrary(int lid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Library library=manager.find(Library.class, lid);
		if(library!=null)
		{
			System.out.println(library);
		}
		else
		{
			System.out.println("Library is  Not Found!!!");
		}
	}
	
	public void deleteUniversity(int uid) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		University university=manager.find(University.class, uid);
		if(university!=null)
		{
			transaction.begin();
			manager.remove(university);
			transaction.commit();
		}
		else
		{
			System.out.println("University is Not Found And Not Deleted");
		}
	}
	
	public void deleteLibrary(int lid) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
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
			System.out.println("Library is Not Found And Not Deleted");
		}
	}
	
	public void findAllUniversity()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select u from University u");
		List<University> universities=query.getResultList();
		for (University university : universities) {
			System.out.println(university);
		}
	}
	
	public void findAllLibrary()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select l from Library l");
		List<Library> libraries=query.getResultList();
		for (Library library : libraries) {
			System.out.println(library);
		}
	}
}
