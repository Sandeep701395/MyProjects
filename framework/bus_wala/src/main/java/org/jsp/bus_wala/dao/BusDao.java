package org.jsp.bus_wala.dao;

import java.util.List;

import org.jsp.bus_wala.dto.Bus;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class BusDao 
{
	public void saveBus(Bus bus)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(bus);
		entityTransaction.commit();
	}
	
	public void updateBus(Bus bus)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(bus);
		entityTransaction.commit();
	}
	
	public void findBus(int bid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Bus bus=entityManager.find(Bus.class, bid);
		if(bus!=null)
		{
			System.out.println(bus);
		}
		else
		{
			System.out.println("Bus is Not Existed....");
		}
	}
	
	public void deleteBus(int bid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bus bus=entityManager.find(Bus.class, bid);
		if(bus!=null)
		{
			entityTransaction.begin();
			entityManager.remove(bus);
			entityTransaction.commit();
			System.out.println("Bus is Not Deleted...");
		}
		else
		{
			System.out.println("Bus Is Not Existed !! Not Deleted...");
		}
	}
	
	public void findAllBuses()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select b from Bus b");
		List<Bus> list=query.getResultList();
		for (Bus bus : list) {
			System.out.println(bus);
		}
	}

}
