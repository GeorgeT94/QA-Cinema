package com.qa.cinema.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.cinema.persistence.domain.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{
}
