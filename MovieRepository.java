package com.abw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abw.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
