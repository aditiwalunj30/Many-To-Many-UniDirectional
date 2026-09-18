package com.abw.service;

import com.abw.entity.Movie;

public interface MovieService {
	
	public Movie saveMovie(Movie movie);
	
	public Movie fetchById(Long movie_Id);
	
	public void removeMovie(Long movie_Id);

}
