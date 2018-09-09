package com.qa.cinema.util;

import java.util.stream.Collectors;

import com.qa.cinema.business.dto.FilmDto;
import com.qa.cinema.persistence.domain.Film;

public class FilmConverter {
	
	public static Film dtoToEntity(FilmDto trainerDto) {
		Film trainer = new Film(trainerDto.getFilmTMDB(), trainerDto.getFilmName(), trainerDto.getFilmPosterURL());
		trainer.setFilmId(trainerDto.getFilmId());
		return trainer;
	}

	public static FilmDto entityToDto(Film trainer) {
		FilmDto trainerDto = new FilmDto(trainer.getFilmId(),trainer.getFilmTMDB(), trainer.getFilmName(), trainer.getFilmPosterURL());
		return trainerDto;
	}
}