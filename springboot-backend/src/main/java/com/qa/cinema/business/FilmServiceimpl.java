package com.qa.cinema.business;

import com.qa.cinema.business.dto.FilmDto;
import com.qa.cinema.persistence.FilmRepository;
import com.qa.cinema.util.FilmConverter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceimpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepository;

	@Override
	public FilmDto getFilmById(Integer filmId) {
		return FilmConverter.entityToDto(filmRepository.getOne(filmId));
	}

	@Override
	public void saveFilm(FilmDto filmDto) {
		filmRepository.save(FilmConverter.dtoToEntity(filmDto));
	}

	@Override
	public List<FilmDto> getAllFilms() {
		return filmRepository.findAll().stream().map(FilmConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public void deleteFilm(Integer id){
		filmRepository.delete(id);
	}
}
