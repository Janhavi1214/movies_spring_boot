package com.day6.movies.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.day6.movies.entity.Movies;

@Service
public interface MovieService {

	Movies save(Movies m);
	
	Movies findById(int id);
	
	Movies findByGenre(String genre);
	
	Movies findbyRating(int rating);
	
	List<Movies> listAll();
	
	Movies delete(Movies m);

	Movies findByReleased(Date released);
}
