package org.jsp.car_wala.dao;

import java.util.List;

import org.jsp.car_wala.dto.Car;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CarDao 
{
	public void saveCar(Car car)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(car);
		
		entityTransaction.commit();
	}
	
	public void updateCar(Car car)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(car);
		entityTransaction.commit();
	}
	
	public void findCar(int cid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager emManager=entityManagerFactory.createEntityManager();
		
		Car car2=emManager.find(Car.class, cid);
		if(car2!=null)
		{
			System.out.println(car2);
		}
		else
		{
			System.out.println("Car is NOt Existed!!!");
		}
	}
	
	public void deleteCarById(int cid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car2=entityManager.find(Car.class, cid);
		if(car2!=null)
		{
			entityTransaction.begin();
			entityManager.remove(car2);
			entityTransaction.commit();
			System.out.println("Car Is Deleted");
		}
		else
		{
			System.out.println("Car id Not Found!! NOt Deleted...");
		}
	}
	
	public void findAllCar()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select c from Car c");
		List<Car> list= query.getResultList();
		for (Car car : list) {
			System.out.println(car);
		}
	}

}
