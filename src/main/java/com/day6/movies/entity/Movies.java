package com.day6.movies.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movies {

	@Id @GeneratedValue
	private int id;
	
	@Column(length = 30)
	private String title;
	
	@Column(length = 30)
	private String genre;
	
	@Column(name = "release_date")
	private Date released;
	
	@Column(name = "rating")
	private int rating;
}
