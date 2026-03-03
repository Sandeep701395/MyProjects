package bike_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveBike 
{
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.setBid(103);
		b.setBrand("Shine");
		b.setColor("yellow");
		b.setCost(95000);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(b);
		et.commit();
		
	}

}
