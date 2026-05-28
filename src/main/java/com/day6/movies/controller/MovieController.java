package com.day6.movies.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day6.movies.entity.Movies;
import com.day6.movies.service.MovieService;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity<Movies> save(@RequestBody Movies m) {
        Movies resp = service.save(m);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movies> findById(@PathVariable int id) {
        Movies resp = service.findById(id);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/genre")
    public ResponseEntity<Movies> findByGenre(@RequestParam String genre) {
        Movies resp = service.findByGenre(genre);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/rating/{rating}")
    public ResponseEntity<Movies> findByRating(@PathVariable int rating) {
        Movies resp = service.findbyRating(rating);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/released")
    public ResponseEntity<Movies> findByReleaseDate(@RequestParam java.sql.Date released) {
        Movies resp = service.findByReleased(released);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movies>> listAll() {
        List<Movies> list = service.listAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}