package org.jsp.oneToMany_Uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.oneToMany_Uni.dao.NetflixMoviesDao;
import org.jsp.oneToMany_Uni.dto.Movies;
import org.jsp.oneToMany_Uni.dto.Netflix;

public class NetflixMoviesController {
	
	public static void main(String[] args) {
		
		Netflix netflix=new Netflix();
		netflix.setNid(103);
		netflix.setName("Kiran");
		netflix.setEmail("Kiran@gmail.com");
		netflix.setPassword(12321);
		
		List<Movies> listMovies = new ArrayList<Movies>();
		Movies movie1=new Movies();
		movie1.setMid(1010);
		movie1.setName("simha");
		movie1.setRating(3.2);
		
		Movies movie2=new Movies();
		movie2.setMid(1011);
		movie2.setName("Akanda");
		movie2.setRating(4.1);
		
		Movies movie3=new Movies();
		movie3.setMid(1012);
		movie3.setName("lion");
		movie3.setRating(2.5);
		
		listMovies.add(movie1);
		listMovies.add(movie2);
		listMovies.add(movie3);
		
		netflix.setMovies(listMovies);
		
		NetflixMoviesDao dao=new NetflixMoviesDao();
//		dao.saveNetflix(netflix);
		
//		dao.saveMovies(listMovies);
		
//		dao.UpdateNetflix(netflix);
		
//		2.Update
//		dao.updateMobiles(movie1);
//		dao.updateMobiles(movie2);
//		dao.updateMobiles(movie3);
		
//		3 Find
//		dao.findNetflix(101);
//		dao.findMovies(1001);
		
//		4.Delete
//		dao.deleteNetflix(103);
//		dao.deleteMovies(1001);   xxxxx
		
//		dao.findAllNetflix();
//		dao.findAllMovies();
		
		
//		dao.addWatchLater(101, listMovies);
		dao.removeFromMovieWatchLater(101, 1012);
	}

}
