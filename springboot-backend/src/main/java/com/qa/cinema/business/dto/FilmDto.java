package com.qa.cinema.business.dto;

import java.util.ArrayList;
import java.util.List;

public class FilmDto {
	
    private Integer filmId;
    private String filmName;
    private Integer filmTMDB;
    private String filmPosterURL;



    public FilmDto() {
    }

    public FilmDto(Integer filmId, Integer filmTMDB,String filmName, String filmPosterURL) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmTMDB = filmTMDB;
        this.filmPosterURL = filmPosterURL;


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

    public void setFilmTMDB(Integer filmTMDB) {
        this.filmTMDB = filmTMDB;
    }

    public String getFilmPosterURL() {
        return filmPosterURL;
    }


    public void setFilmPosterURL(String filmPosterURL) {
        this.filmPosterURL = filmPosterURL;
    }

    public Integer getFilmTMDB() {
        return filmTMDB;
    }

}
