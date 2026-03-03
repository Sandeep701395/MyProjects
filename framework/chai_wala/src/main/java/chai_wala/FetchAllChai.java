package chai_wala;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllChai 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//		Query q=em.createQuery("select c from Chai c");
//		List<Chai>	l=q.getResultList();
//		for (Chai chai : l) {
//			System.out.println(chai);
//		}
		
		
		//Using JPQL Query
		
		Query q=em.createQuery("select c from Chai c where c.type=?1");
		q.setParameter(1,"Ginger");
		Chai c=(Chai) q.getSingleResult();
		System.out.println(c);
		
	}

}
