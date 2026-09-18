package com.abw.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.abw.entity.Actor;
import com.abw.entity.Movie;
import com.abw.service.MovieService;

@Component
public class MyRunner implements ApplicationRunner{
	
	@Autowired
	private MovieService movieService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
/*	
		Movie m = new Movie();
		m.setMovieId(101L);
		m.setTitle("Sholay");
		m.setReleaseDate(LocalDate.now());
		m.setRelaeseYear(2019);
		
		Actor a1 = new Actor();
		a1.setActorId(1L);
		a1.setName("AB");
		a1.setBirthdate(LocalDate.parse("2000-06-19"));
		
		Actor a2 = new Actor();
		a2.setActorId(2L);
		a2.setName("DD");
		a2.setBirthdate(LocalDate.parse("2000-05-20"));
		
		List<Actor> actor = Arrays.asList(a1,a2);
		
		m.setActors(actor);
		
		m = movieService.saveMovie(m);
		System.out.println("Movie and Actors saved!!");
	}
	
*/
	
	movieService.removeMovie(101L);
	System.out.println("Movie Removed");
	
	}
}

