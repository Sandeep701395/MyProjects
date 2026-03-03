package org.jsp.compositeKey.dao;

import java.util.List;

import org.jsp.compositeKey.dto.Amazone;
import org.jsp.compositeKey.dto.AmazoneId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class AmazoneDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	
	public void saveAmazone(Amazone amazone)
	{
		transaction.begin();
		manager.persist(amazone);
		transaction.commit();
	}
	
	
	public void updateAmazone(AmazoneId amazoneId,Amazone amazone)
	{
		Amazone amazone2=manager.find(Amazone.class, amazoneId);
		if(amazone2 != null)
		{
			amazone2.setName(amazone.getName());
			amazone2.setAddress(amazone.getAddress());
			amazone2.setPassword(amazone.getPassword());
			
			transaction.begin();
			manager.merge(amazone2);
			transaction.commit();
		}
	}
	
	public void findAmazone(AmazoneId amazoneId)
	{
		Amazone amazone=manager.find(Amazone.class, amazoneId);
		if(amazone != null)
		{
			System.out.println(amazone.getName());
			System.out.println(amazone.getAddress());
			System.out.println(amazone.getPassword());
			System.out.println(amazone.getAmazoneId().getEmail());
			System.out.println(amazone.getAmazoneId().getMobileNo());
		}
		else
		{
			System.out.println("Amazone Is not Found...");
		}
	}
	
	public void deleteAmazone(AmazoneId amazoneId)
	{
		Amazone amazone=manager.find(Amazone.class, amazoneId);
		if(amazone != null)
		{
			transaction.begin();
			manager.remove(amazone);
			transaction.commit();
		}
	}
	
	public void findAllAmazone()
	{
		Query query=manager.createQuery("select a from Amazone a");
		List<Amazone> amazones=query.getResultList();
		for (Amazone amazone : amazones) {
			System.out.println(amazone);
		}
		
	}
	
	
}
