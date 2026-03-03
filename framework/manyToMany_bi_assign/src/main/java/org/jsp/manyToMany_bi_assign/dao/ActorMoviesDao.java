package org.jsp.manyToMany_bi_assign.dao;

import java.util.List;

import org.jsp.manyToMany_bi_assign.dto.Actors;
import org.jsp.manyToMany_bi_assign.dto.Movies;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ActorMoviesDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveActors(List<Actors> actors)
	{
		for (Actors actors2 : actors) {
			transaction.begin();
			manager.persist(actors2);
			transaction.commit();
		}
	}
	
	public void saveMovies(List<Movies> movies)
	{
		for (Movies movies2 : movies) {
			transaction.begin();
			manager.persist(movies2);
			transaction.commit();
		}
	}
	
	public void updateActor(int aid,Actors actors)
	{
		Actors actors2=manager.find(Actors.class, aid);
		if(actors2 != null)
		{
			actors2.setName(actors.getName());
			actors2.setAge(actors.getAge());
			actors2.setRemunation(actors.getRemunation());
			
			transaction.begin();
			manager.merge(actors2);
			transaction.commit();
		}
	}
	
	public void updateMovie(int mid,Movies movies)
	{
		Movies movies2=manager.find(Movies.class, mid);
		if(movies2 != null)
		{
			movies2.setName(movies.getName());
			movies2.setBudget(movies2.getBudget());
			movies2.setReleaseYear(movies.getReleaseYear());
			
			transaction.begin();
			manager.merge(movies2);
			transaction.commit();
		}
	}
	
	public void findActor(int aid)
	{
		Actors actors=manager.find(Actors.class, aid);
		if(actors != null)
		{
			System.out.println(actors);
		}
		else
		{
			System.out.println("Actor Id Is Not Found...");
		}
	}
	
	public void findMovie(int mid)
	{
		Movies movies=manager.find(Movies.class, mid);
		if(movies != null)
		{
			System.out.println(movies);
		}
		else
		{
			System.out.println("MOvie Id Is Not Found...");
		}
	}
	
	public void deleteActor(int aid)
	{
		Actors actors=manager.find(Actors.class, aid);
		if(actors != null)
		{
			transaction.begin();
			manager.remove(actors);
			transaction.commit();
		}
	}
}
