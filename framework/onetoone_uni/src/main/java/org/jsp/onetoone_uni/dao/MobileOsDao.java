package org.jsp.onetoone_uni.dao;

import java.util.List;

import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class MobileOsDao 
{
	public void saveMobile(Mobile mobile)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(mobile);
		transaction.commit();
	}
	
	public void saveOs(Os os) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
		
	}
	
	public void updateMobile(Mobile mobile)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(mobile);
		transaction.commit();
	}
	
	public void updateOs(Os os) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(os);
		entityTransaction.commit();
		
	}
	
	public void findMobile(int mid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Mobile mobile=manager.find(Mobile.class, mid);
		if(mobile!=null)
		{
			System.out.println(mobile);
		}
		else
		{
			System.out.println("Mobile is Not Existed....");
		}
	}
	
	public void findOs(int osId)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Os os=manager.find(Os.class, osId);
		if(os!=null)
		{
			System.out.println(os);
		}
		else
		{
			System.out.println("Mobile is Not Existed....");
		}
	}
	
	public void removeMobile(int mid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		Mobile mobile=manager.find(Mobile.class, mid);
		if(mobile!=null)
		{
			entityTransaction.begin();
			manager.remove(mobile);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Mobile is Not Deleted....");
		}
	}
	
	public void removeOs(int osId)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		Os os=manager.find(Os.class, osId);
		if(os!=null)
		{
			entityTransaction.begin();
			manager.remove(os);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Mobile is Not Deleted....");
		}
	}
	
	public void findAllMobile()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query q= manager.createQuery("select m from Mobile m");
		List<Mobile> mobiles=q.getResultList();
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
	}
	
	public void findAllOs()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query q=manager.createQuery("select o from Os o");
		List<Os> os=q.getResultList();
		for (Os os2 : os) {
			System.out.println(os2);
		}
	}
	
}
