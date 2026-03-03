package chai_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateChai
{
	public static void main(String[] args)
	{
		Chai c=new Chai();
		c.setCid(3);
		c.setType("GreenTea");
		c.setCost(30);
		c.setMilkQuantity(20.8);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.merge(c);
		et.commit();
		
	}

}
