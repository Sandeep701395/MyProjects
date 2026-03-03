package org.jsp.manyToMany_bi_assign.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToMany_bi_assign.dao.ActorMoviesDao;
import org.jsp.manyToMany_bi_assign.dto.Actors;
import org.jsp.manyToMany_bi_assign.dto.Movies;

public class ActorMoviesController {

	public static void main(String[] args) {
		
		List<Actors> listActors=new ArrayList<Actors>();
		
		Actors actor1=new Actors();
		actor1.setName("Kamal");
		actor1.setAge(68);
		actor1.setRemunation(70);
		
		Actors actor2=new Actors();
		actor2.setName("Kamal");
		actor2.setAge(68);
		actor2.setRemunation(70);
		
		List<Movies> listMovies=new ArrayList<Movies>();
		
		Movies movie1=new Movies();
		movie1.setName("Vikram");
		movie1.setBudget(150);
		movie1.setReleaseYear(2022);
		
		Movies movie2=new Movies();
		movie2.setName("Hit-3");
		movie2.setBudget(70);
		movie2.setReleaseYear(2024);
		
		movie1.setActors(listActors);
		movie2.setActors(listActors);
		
		actor1.setMovies(listMovies);
		actor2.setMovies(listMovies);
		
		listActors.add(actor1);
		listActors.add(actor2);
		
		listMovies.add(movie1);
		listMovies.add(movie2);
		
		ActorMoviesDao dao=new ActorMoviesDao();
//		dao.saveActors(listActors);
//		dao.saveMovies(listMovies);
//		dao.saveActors(listActors);
//		dao.saveMovies(listMovies);
		
//		dao.updateActor(7, actor2);
//		dao.updateMovie(7, movie1);
		
//		dao.findActor(5);
//		dao.findMovie(4);
		
		dao.deleteActor(1);
	}
}
