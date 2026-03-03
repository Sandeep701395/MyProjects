package cycle_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveCycle
{
	public static void main(String[] args) 
	{
		Cycle c=new Cycle();
		c.setCid(12);
		c.setBrand("Terrain");
		c.setColor("Red");
		c.setCost(8000);
		c.setType("Gear");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(c);
		et.commit();
		
	}

}
