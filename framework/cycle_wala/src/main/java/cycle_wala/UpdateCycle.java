package cycle_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateCycle 
{
	public static void main(String[] args) 
	{
		Cycle c=new Cycle();
		c.setCid(12);
		c.setBrand("Sprint");
		c.setColor("Yellow");
		c.setCost(4500);
		c.setType("Normal");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.merge(c);
		et.commit();
		
	}

}
