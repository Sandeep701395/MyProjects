package cycle_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteCycle
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Cycle c=em.find(Cycle.class, 11);
		
		if(c != null)
		{
			et.begin();
			em.remove(c);
			et.commit();
		}
		else
		{
			System.out.println("Cycle Object is not Present in database...");
		}
		
	}

}
