package com.day6.movies.repo;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day6.movies.entity.Movies;

@Repository
public interface MovieRepo extends JpaRepository<Movies, Integer>{

	public Movies findByGenre(String genre);
	
	public Movies findById(int id);

	public Movies findByRating(int rating);

	public Movies findByReleased(Date released);
}
