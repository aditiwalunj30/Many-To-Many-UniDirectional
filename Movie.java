package com.abw.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
	
	@Id
	private Long movieId;
	
	private String title;
	
	private LocalDate releaseDate;
	
	@Column(name = "release_year") 
	private Integer relaeseYear;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
	    name = "movie_actor", 
	    joinColumns = @JoinColumn(name = "movie_id"), 
	    inverseJoinColumns = @JoinColumn(name = "actor_id") 
	)
	private List<Actor> actors;


}
