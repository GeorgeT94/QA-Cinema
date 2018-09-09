package com.qa.cinema.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.cinema.persistence.domain.Showing;

import java.util.List;

@Repository
public interface ShowingRepository extends JpaRepository<Showing, Integer> {
     List<Showing> findAllByShowingTMDBEquals(Integer tmdb);
}
