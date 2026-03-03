package org.jsp.onetoone_uni_assignment.dao;

import java.util.List;

import org.jsp.onetoone_uni_assignment.dto.Farmer;
import org.jsp.onetoone_uni_assignment.dto.Land;
import org.jsp.onetoone_uni_assignment.dto.Land;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FarmerAndLandDao
{

	public void saveFarmer(Farmer farmer)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		entityTransaction.begin();
		manager.persist(farmer);
		entityTransaction.commit();
	}
	
	public void saveLand(Land land) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(land);
		transaction.commit();
		
	}
	
	public void updateFarmer(Farmer farmer)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction entityTransaction=manager.getTransaction();
		
		entityTransaction.begin();
		manager.merge(farmer);
		entityTransaction.commit();
	}
	
	public void updateLand(Land land) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(land);
		transaction.commit();
		
	}
	
	public void findFarmer(int fid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Farmer farmer=manager.find(Farmer.class, fid);
		if(farmer != null)
		{
			System.out.println(farmer);
		}
		else
		{
			System.out.println("Farmer is not Find!!!.....");
		}
	}
	
	public void findLand(int lid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Land land=manager.find(Land.class, lid);
		if(land != null)
		{
			transaction.begin();
			manager.remove(land);
			transaction.commit();
		}
		else
		{
			System.out.println("Farmer is not found!!!.....");
		}
	}
	
	public void deleteFarmer(int fid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Farmer farmer=manager.find(Farmer.class, fid);
		if(farmer != null)
		{
			transaction.begin();
			manager.remove(farmer);
			transaction.commit();
		}
		else
		{
			System.out.println("Farmer is not Deleted!!!.....");
		}
	}
	
	
	public void deleteLand(int lid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Land land=manager.find(Land.class, lid);
		if(land != null)
		{
			transaction.begin();
			manager.remove(land);
			transaction.commit();
		}
		else
		{
			System.out.println("Land is not Deleted!!!.....");
		}
	}
	
	public void findAllFarmer()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query q=manager.createQuery("select f from Farmer f");
		List <Farmer> farmers=q.getResultList();
		for (Farmer farmer : farmers) {
			System.out.println(farmer);
		}
	}
	
	public void findAllLand()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query q=manager.createQuery("select l from Land l");
		List <Land> lands=q.getResultList();
		for (Land land : lands) {
			System.out.println(land);
		}
	}
	
}
