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
		Film film = new Film(399360, "Alpha", "Experience the incredible story  friend", "Adventure", "After a hunting .", 75.67, 5.4, "/afdZAIcAQscziqVtsEoh2PwsYTW.jpg", "http://www.alpha-themovie.com", "Studio 8", "96", null);
		film.setShowings(Arrays.asList(new Showing("8:00"), new Showing("12:00")));
		film= filmRepository.save(film);
	}
}
