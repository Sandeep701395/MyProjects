package org.jsp.manyToOne_uni.dao;

import java.util.List;

import org.jsp.manyToOne_uni.dto.Director;
import org.jsp.manyToOne_uni.dto.Movies;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class MoviesDirectorDao 
{
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveMovies(List<Movies> movies)
	{
		for (Movies movies2 : movies) {
			transaction.begin();
			manager.persist(movies2);
			transaction.commit();
		}
	}
	
	public void saveDirector(Director director)
	{
		transaction.begin();
		manager.persist(director);
		transaction.commit();
	}
	
	public void updateDirector(Director director)
	{
		transaction.begin();
		manager.merge(director);
		transaction.commit();
	}
	
	public void updateMovies(List<Movies> movies)
	{
		for (Movies movies2 : movies) {
			transaction.begin();
			manager.merge(movies2);
			transaction.commit();
		}
	}

	public void findDirector(int did)
	{
		Director director=manager.find(Director.class, did);
		if(director != null)
		{
			System.out.println(director);
		}
		else
		{
			System.out.println("Director is Not Found...");
		}
	}
	
	public void findMovies(int mid)
	{
		Movies movies=manager.find(Movies.class, mid);
		if(movies != null)
		{
			System.out.println(movies);
		}
		else
		{
			System.out.println("Movie is Not found");
		}
	}
	
	public void deleteDirector(int did)
	{
		Director director=manager.find(Director.class, did);
		if(director != null)
		{
			transaction.begin();
			manager.remove(director);
			transaction.commit();
		}
		else
		{
			System.out.println("Director is Not Found And Not Deleted...");
		}
	}
	
	public void deleteMovies(int mid)
	{
		Movies movies=manager.find(Movies.class, mid);
		if(movies != null)
		{
			transaction.begin();
			manager.remove(movies);
			transaction.commit();
		}
		else
		{
			System.out.println("Movie Is Not Found Not Deleted...");
		}
	}
	
	public void findAllDirector()
	{
		Query query=manager.createQuery("select d from Director d");
		List<Director> directors=query.getResultList();
		for (Director director : directors) {
			System.out.println(director);
		}
	}
	
	public void findAllMovies()
	{
		Query query=manager.createQuery("select m from Movies m");
		List<Movies> movies=query.getResultList();
		for (Movies movie : movies) {
			System.out.println(movie);
		}
	}
	
	public void addMovieLater(Movies movies,int did)
	{
		Director director=manager.find(Director.class, did);
		if(director != null)
		{
			movies.setDirector(director);
			transaction.begin();
			manager.merge(movies);
			transaction.commit();
		}
		else
		{
			System.out.println("Director Not Found...");
		}
	}
	
	public void removeMovieFromLater(int mid)
	{
		Movies movie=manager.find(Movies.class, mid);
		if(movie != null)
		{
			movie.setDirector(null);
			transaction.begin();
			manager.merge(movie);
			transaction.commit();
		}
		else
		{
			System.out.println("Movie is Not Found...");
		}
	}
}
