package com.qa.cinema;

import com.qa.cinema.persistence.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.qa.cinema.persistence.FilmRepository;
import com.qa.cinema.persistence.domain.Showing;
import com.qa.cinema.persistence.domain.Film;
import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class App {
	
	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private ShowingRepository showingRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){



		Film film = new Film(399360, "Alpha", "/afdZAIcAQscziqVtsEoh2PwsYTW.jpg");
		film= filmRepository.save(film);
		Showing showing1 = new Showing("13:00", 399360);
		Showing showing2 = new Showing("17:00", 399360);
		showing1 = showingRepository.save(showing1);
		showing2 = showingRepository.save(showing2);


	}
}
