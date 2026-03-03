package org.jsp.manyToOne_uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToOne_uni.dao.MoviesDirectorDao;
import org.jsp.manyToOne_uni.dto.Director;
import org.jsp.manyToOne_uni.dto.Movies;

public class MoviesDirectorController {

	public static void main(String[] args) {
		
		Director director=new Director();
		director.setDid(1);
		director.setName("rajamouli");
		director.setAge(55);
		
		List<Movies> movies=new ArrayList<Movies>();
		Movies movie1=new Movies();
		movie1.setMid(106);
		movie1.setName("Magadeera");
		movie1.setBudget(75);
		movie1.setRating(4.7);
		movie1.setDirector(director);
		
		Movies movie2=new Movies();
		movie2.setMid(103);
		movie2.setName("Eega");
		movie2.setBudget(50);
		movie2.setRating(4.4);
		movie2.setDirector(director);
		
		movies.add(movie1);
		movies.add(movie2);
		
		MoviesDirectorDao dao=new MoviesDirectorDao();
//		dao.saveMovies(movies);
//		dao.saveDirector(director);
		
//		dao.updateDirector(director);
//		dao.updateMovies(movies);
		
//		dao.findDirector(2);
//		dao.findMovies(109);
		
//		dao.deleteDirector(2);
//		dao.deleteMovies(103);   xxxxx
		
//		dao.findAllDirector();
//		dao.findAllMovies();
		
//		dao.addMovieLater(movie1, 1);
//		dao.removeMovieFromLater(106);
		
		
	}
}
