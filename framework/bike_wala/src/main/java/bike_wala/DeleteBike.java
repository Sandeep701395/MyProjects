package bike_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBike 
{
	public static void main(String[] args) 
	{
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bike b=em.find(Bike.class, 103);
		if(b != null)
		{	
			et.begin();
			em.remove(b);
			et.commit();
		}
		else
		{
			System.out.println("Bike Is Not Found ... We Cannot deleted Bike....");
		}
	}

}
