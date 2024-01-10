package com.dao;

import java.util.List;

import com.pojo.Movie;

public interface MovieDao
{

	void addMovie(Movie movie);
	void updateMovie(Movie movie);
	void deleteMovie(int mid);
	List<Movie>showMovieList();
	Movie searchMovieById(int mid);
	
}


