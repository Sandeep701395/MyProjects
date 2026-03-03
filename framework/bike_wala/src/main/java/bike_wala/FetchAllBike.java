	package bike_wala;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllBike 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
//////////		Query q=em.createQuery("select * from bike"); it is not work in hibernate
//		Query q=em.createQuery("select b from Bike b");
//		List <Bike> l=q.getResultList();
//		for (Bike bike : l) {
//			System.out.println(bike);
//		}
		
		Query q=em.createQuery("select b from Bike b where b.brand=?1");
		q.setParameter(1, "Hero");
		Bike b=(Bike) q.getSingleResult();
		System.out.println(b);
		
		Query q1=em.createQuery("select b from Bike b where b.cost=?1 and b.color=?2");
		q1.setParameter(1, "75000.0");
		q1.setParameter(2, "Black");
		Bike b1=(Bike) q1.getSingleResult();
		System.out.println(b1);
	}
	
}
