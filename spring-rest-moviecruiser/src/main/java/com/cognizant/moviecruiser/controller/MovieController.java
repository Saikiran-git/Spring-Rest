package com.cognizant.moviecruiser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	MovieService service;
	
	@GetMapping("/{title}")
	public String getMovie(@PathVariable String title) {
		LOGGER.info("Into getMovie method in MovieController Class");
		Movie movie = service.getMovie(title);
		if(movie==null) return "Movie not Found";
		return movie.toString();
	}
	
	@GetMapping
	public List<Movie> getAllMovies(){
		LOGGER.info("Into getAllMovies method in MovieController Class");
		return service.getAllMovies();
	}
}
