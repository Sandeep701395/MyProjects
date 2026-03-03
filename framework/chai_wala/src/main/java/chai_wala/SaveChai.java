package chai_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveChai 
{
	public static void main(String[] args) 
	{
		Chai c=new Chai();
		c.setCid(3);
		c.setType("BlackTea");
		c.setCost(25);
		c.setMilkQuantity(5.5);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(c);
		et.commit();
		
		
	}

}
