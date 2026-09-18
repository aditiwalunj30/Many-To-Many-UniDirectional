package com.abw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abw.entity.Movie;
import com.abw.repository.MovieRepository;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movierepo;
	
	public Movie saveMovie(Movie movie)
	{
		return movierepo.save(movie);
	}

	@Override
	public Movie fetchById(Long movie_Id) {
		
		return movierepo.findById(movie_Id).get();
	}

	@Override
	public void removeMovie(Long movie_Id) {
		movierepo.deleteById(movie_Id);
		
	}
	
	
	
}
