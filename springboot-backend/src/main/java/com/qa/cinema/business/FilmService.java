package com.qa.cinema.business;

import java.util.List;

import com.qa.cinema.business.dto.FilmDto;

public interface FilmService {
    FilmDto getFilmById(Integer filmId);
    void saveFilm(FilmDto filmDto);
    List<FilmDto> getAllFilms();
    void deleteFilm(Integer id);

}
