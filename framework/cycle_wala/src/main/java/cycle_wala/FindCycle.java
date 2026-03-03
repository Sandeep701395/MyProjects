package cycle_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindCycle 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Cycle c=em.find(Cycle.class, 12);
		if(c != null)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("Cycle is Not Found...!!!!");
		}
		
	}

}
