package com.qa.cinema.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qa.cinema.business.FilmService;
import com.qa.cinema.business.dto.FilmDto;
import com.qa.cinema.constants.Constants;

@RequestMapping(Constants.FILM)
@RestController
public class FilmController {
	
	@Autowired
	FilmService filmService;

	@CrossOrigin
	@RequestMapping(Constants.GET_FILM_BY_ID)
	public FilmDto getFilmById(@PathVariable Integer filmId) {
		return filmService.getFilmById(filmId);
	}

	@CrossOrigin
	@RequestMapping(Constants.GET_ALL_FILMS)
	public List<FilmDto> getAllFilms() {
		return filmService.getAllFilms();
	}

	@CrossOrigin
	@RequestMapping(value= Constants.SAVE_FILM, method= RequestMethod.POST)
	public void saveFilm(@RequestBody FilmDto filmDto) {
		filmService.saveFilm(filmDto);
	}
}

