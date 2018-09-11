package com.qa.cinema;

import com.qa.cinema.persistence.AdminRepository;
import com.qa.cinema.persistence.ShowingRepository;
import com.qa.cinema.persistence.domain.Admin;
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

	@Autowired
	private AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){



		Film film = new Film(399360, "Alpha", "/afdZAIcAQscziqVtsEoh2PwsYTW.jpg");
		Film film2 = new Film(372058, "Your Name.", "/xq1Ugd62d23K2knRUx6xxuALTZB.jpg");

		film= filmRepository.save(film);
		film2= filmRepository.save(film2);

		Showing showing1 = new Showing("13:00", 399360);
		Showing showing2 = new Showing("17:00", 399360);
		Showing showing3 = new Showing("17:00", 372058);

		showing1 = showingRepository.save(showing1);
		showing2 = showingRepository.save(showing2);
		showing3 = showingRepository.save(showing3);

		Admin admin = new Admin("admin", "password");
		admin = adminRepository.save(admin);

	}
}
