package com.qa.cinema.util;

import java.util.stream.Collectors;

import com.qa.cinema.business.dto.FilmDto;
import com.qa.cinema.persistence.domain.Film;

public class FilmConverter {
	
	public static Film dtoToEntity(FilmDto trainerDto) {
		Film trainer = new Film(trainerDto.getFilmName(), null);
		trainer.setFilmId(trainerDto.getFilmId());
		trainer.setShowings(trainerDto.getShowings().stream().map(ShowingConverter::dtoToEntity).collect(Collectors.toList()));
		return trainer;
	}

	public static FilmDto entityToDto(Film trainer) {
		FilmDto trainerDto = new FilmDto(trainer.getFilmId(), trainer.getFilmName(), null);
		trainerDto.setShowings(trainer.getShowings().stream().map(ShowingConverter::entityToDto).collect(Collectors.toList()));
		return trainerDto;
	}
}