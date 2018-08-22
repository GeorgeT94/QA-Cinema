package com.qa.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.qa.cinema.persistence.FilmRepository;
import com.qa.cinema.persistence.domain.Showing;
import com.qa.cinema.persistence.domain.Film;
import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class App {
	
	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Film film= new Film("The Great Escape", null);
		film.setShowings(Arrays.asList(new Showing("8:00"), new Showing("12:00")));
		film= filmRepository.save(film);
	}
}
