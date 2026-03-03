package org.jsp.oneToMany_Uni.dao;

import java.util.List;

import org.jsp.oneToMany_Uni.dto.Movies;
import org.jsp.oneToMany_Uni.dto.Netflix;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class NetflixMoviesDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	
	public void saveNetflix(Netflix netflix) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(netflix);
		transaction.commit();
	}
	
	public void saveMovies(List<Movies> movies) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		for (Movies movies2 : movies) {
			transaction.begin();
			manager.persist(movies2);
			transaction.commit();
		}
	}
	
	public void addWatchLater(int nid,List<Movies> listMovies)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Netflix netflix=entityManager.find(Netflix.class, nid);
		if(netflix != null)
		{
			List<Movies> dblistMovies=netflix.getMovies();
			if(dblistMovies != null)
			{
				dblistMovies.addAll(listMovies);
				transaction.begin();
				entityManager.merge(netflix);
				transaction.commit();
			}
			else
			{
				netflix.setMovies(listMovies);
				transaction.begin();
				entityManager.merge(netflix);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Netflix Id Not Found");
		}
	}
	
	public void removeFromMovieWatchLater(int nid,int mid)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		Netflix netflix=entityManager.find(Netflix.class, nid);
		Movies movies=entityManager.find(Movies.class, mid);
		
		if(netflix != null && movies != null)
		{
			List<Movies> dblistMovies=netflix.getMovies();
			if(dblistMovies.contains(movies))
			{
				dblistMovies.remove(movies);
				transaction.begin();
				entityManager.merge(movies);
				transaction.commit();
			}
			else
			{
				System.out.println("Movies Not Added To Account");
			}
		}
		else
		{
			System.out.println("Nid or Mid DoesNot Exist");
		}
	}
	
	public void UpdateNetflix(Netflix netflix)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(netflix);
		transaction.commit();
	}
	
	public void updateMobiles(Movies movies)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(movies);
		transaction.commit();
	}
	
	public void findNetflix(int nid)
	{
		EntityManager manager=getEntityManager();
		Netflix netflix=manager.find(Netflix.class, nid);
		if(netflix != null)
		{
			System.out.println(netflix);
		}
		else
		{
			System.out.println("NetFlix User is Not Found");
		}
	}
	
	
	public void findMovies(int mid)
	{
		EntityManager manager=getEntityManager();
		Movies movies=manager.find(Movies.class, mid);
		if(movies!=null)
		{
			System.out.println(movies);
		}
		else
		{
			System.out.println("Movie not found");
		}
	}
	
	public void deleteNetflix(int nid)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Netflix netflix=manager.find(Netflix.class, nid);
		if(netflix != null)
		{
			transaction.begin();
			manager.remove(netflix);
			transaction.commit();
		}
		else
		{
			System.out.println("Netflix user is Not Found And Not Deleted...");
		}
	}
	
	public void deleteMovies(int mid)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		Movies movies=manager.find(Movies.class, mid);
		if(movies != null)
		{
			transaction.begin();
			manager.remove(movies);
			transaction.commit();
		}
		else
		{
			System.out.println("Movies Are not And found Not deleted...");
		}
	}
	
	public void findAllNetflix() {
		EntityManager manager= getEntityManager();
		Query query=manager.createQuery("select n from Netflix n");
		List<Netflix> netflixs=query.getResultList();
		for (Netflix netflix : netflixs) {
			System.out.println(netflix);
		}
	}
	
	public void findAllMovies() {
		EntityManager manager=getEntityManager();
		Query query=manager.createQuery("select m from Movies m");
		List<Movies> movies=query.getResultList();
		for (Movies movies2 : movies) {
			System.out.println(movies2);
		}
	}
}
