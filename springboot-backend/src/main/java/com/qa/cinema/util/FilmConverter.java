package com.qa.cinema.util;

import java.util.stream.Collectors;

import com.qa.cinema.business.dto.FilmDto;
import com.qa.cinema.persistence.domain.Film;

public class FilmConverter {
	
	public static Film dtoToEntity(FilmDto trainerDto) {
		Film trainer = new Film(trainerDto.getFilmTMDB(), trainerDto.getFilmName(), trainerDto.getFilmTagLine(), trainerDto.getFilmGenres(), trainerDto.getFilmOverview(), trainerDto.getFilmPopularity(), trainerDto.getFilmRating(), trainerDto.getFilmPosterURL(), trainerDto.getFilmWebsite(), trainerDto.getFilmProduction(), trainerDto.getFilmRuntime(), null);
		trainer.setFilmId(trainerDto.getFilmId());
		trainer.setShowings(trainerDto.getShowings().stream().map(ShowingConverter::dtoToEntity).collect(Collectors.toList()));
		return trainer;
	}

	public static FilmDto entityToDto(Film trainer) {
		FilmDto trainerDto = new FilmDto(trainer.getFilmId(),trainer.getFilmTMDB(), trainer.getFilmName(), trainer.getFilmTagLine(), trainer.getFilmGenres(), trainer.getFilmOverview(), trainer.getFilmPopularity(), trainer.getFilmRating(), trainer.getFilmPosterURL(), trainer.getFilmWebsite(),  trainer.getFilmProduction(), trainer.getFilmRuntime(), null);
		trainerDto.setShowings(trainer.getShowings().stream().map(ShowingConverter::entityToDto).collect(Collectors.toList()));
		return trainerDto;
	}
}