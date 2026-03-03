package org.jsp.onetoone_bi.dao;

import java.util.List;

import org.jsp.onetoone_bi.dto.Bike;
import org.jsp.onetoone_bi.dto.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BikeEngineDao
{
	public void saveBike(Bike bike) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(bike);
		transaction.commit();
	}
	
	public void saveEngine(Engine engine) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(engine);
		transaction.commit();
		
	}
	
	public void updateBike(Bike bike)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(bike);
		transaction.commit();
	}
	
	public void updateEngine(Engine engine)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(engine);
		transaction.commit();
	}
	
	public void findBike(int bid)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Bike bike=manager.find(Bike.class, bid);
		if(bike !=null)
		{
			System.out.println(bike);
		}
		else
		{
			System.out.println("Bike is Not found");
		}
	}
	
	public void findEngine(int eid)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Engine engine=manager.find(Engine.class, eid);
		if(engine !=null)
		{
			System.out.println(engine);
		}
		else
		{
			System.out.println("Bike is Not found");
		}
	}
	
	public void deleteBike(int bid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Bike bike=manager.find(Bike.class, bid);
		if(bike != null)
		{
			transaction.begin();
			manager.remove(bike);
			transaction.commit();
		}
	}
	
	public void deleteEngine(int eid)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Engine engine=manager.find(Engine.class, eid);
		if(engine != null)
		{
			transaction.begin();
			manager.remove(engine);
			transaction.commit();
		}
	}
	
	public void findAllBikes()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select b from Bike b");
		List <Bike> list=query.getResultList();
		for (Bike bike : list) {
			System.out.println(bike);
		}
	}
	
	public void findAllEngines() {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("select e from Engine e");
		List<Engine> list=query.getResultList();
		for (Engine engine : list) {
			System.out.println(engine);
		}
	}
}
