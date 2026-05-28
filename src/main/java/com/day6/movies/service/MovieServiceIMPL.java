package com.day6.movies.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day6.movies.entity.Movies;
import com.day6.movies.repo.MovieRepo;

@Service
public class MovieServiceIMPL implements MovieService {

    @Autowired
    private MovieRepo repo;

    @Override
    public Movies save(Movies m) {
        return repo.save(m);
    }

    @Override
    public Movies findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Movies findByGenre(String genre) {
        return repo.findByGenre(genre);
    }

    @Override
    public Movies findByReleased(Date released) {
        return repo.findByReleased(released);
    }

    @Override
    public Movies findbyRating(int rating) {
        return repo.findByRating(rating);
    }

    @Override
    public List<Movies> listAll() {
        return repo.findAll();
    }

    @Override
    public Movies delete(Movies m) {
        repo.delete(m);
        return m;
    }
}