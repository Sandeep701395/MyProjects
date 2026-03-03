package bike_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateBike 
{
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.setBid(103);
		b.setBrand("Pulser");
		b.setColor("Red");
		b.setCost(95000);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.merge(b);
		et.commit();
		
		
//		difference between persist() and Merge()
//		-> In case of Persist() we can insert the records with primary key
//		-> in case of merge() we can update and insert the records
		
	}

}
