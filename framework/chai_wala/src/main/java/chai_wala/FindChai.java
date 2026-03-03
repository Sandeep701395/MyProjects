package chai_wala;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindChai 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		
		Chai c=em.find(Chai.class, 2);
		
		if(c != null)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("Chai is not Found...!!!!");
		}
		
		
	}

}
