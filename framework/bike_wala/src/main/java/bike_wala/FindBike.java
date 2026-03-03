package bike_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindBike 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		Bike b=em.find(Bike.class, 101);
		if(b!=null)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("Bike Is Not Found....!!!!");
		}
	}

}
