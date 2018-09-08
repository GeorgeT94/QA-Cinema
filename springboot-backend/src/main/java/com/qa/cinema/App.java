package com.qa.cinema;

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

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		List<Showing> list = new LinkedList<>();
		list.add(new Showing("8:00"));
		list.add(new Showing("12:00"));


		Film film = new Film(399360, "Alpha", "Experience the incredible story  friend", "Adventure", "After a hunting .", 75.67, 5.4, "/afdZAIcAQscziqVtsEoh2PwsYTW.jpg", "http://www.alpha-themovie.com", "Studio 8", "96", list);
		//film.setShowings(Arrays.asList(new Showing("8:00"), new Showing("12:00")));
		film= filmRepository.save(film);
	}
}
