package com.qa.cinema.business.dto;

import java.util.ArrayList;
import java.util.List;

public class FilmDto {
	
    private Integer filmId;
    private String filmName;
    private List<ShowingDto> showings= new ArrayList<>();

    public FilmDto(Integer filmId, String filmName, List<ShowingDto> showings) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.showings = showings;
    }

    public FilmDto() {
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public List<ShowingDto> getShowings() {
        return showings;
    }

    public void setShowings(List<ShowingDto> showings) {
        this.showings = showings;
    }
}
