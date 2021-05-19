package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieService {
	
	ApplicationContext a = new ClassPathXmlApplicationContext("movie.xml");
	
	@SuppressWarnings("unchecked")
	public List<Movie> getAllMovies(){
		return (List<Movie>)a.getBean("movieList",List.class);
	}
	
	
	@SuppressWarnings("unchecked")
	public Movie getMovie(String title) {
		List<Movie> bean = a.getBean("movieList",List.class);
		for(Movie i:bean) if(i.getTitle().equalsIgnoreCase(title)) return i;
		return null;
	}
}
