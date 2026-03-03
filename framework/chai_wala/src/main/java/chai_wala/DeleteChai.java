package chai_wala;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteChai 
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Chai c=em.find(Chai.class, 3);
		
		et.begin();
		em.remove(c);
		et.commit();
		
	}

}
