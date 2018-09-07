package com.qa.cinema.business.dto;

import java.util.ArrayList;
import java.util.List;

public class FilmDto {
	
    private Integer filmId;
    private String filmName;
    private Integer filmTMDB;
    private String filmTagLine;
    private String filmGenres;
    private String filmOverview;
    private Double filmPopularity;
    private Double filmRating;
    private String filmPosterURL;
    private String filmWebsite;
    private String filmProduction;
    private String filmRuntime;

    private List<ShowingDto> showings= new ArrayList<>();

    public FilmDto() {
    }

    public FilmDto(Integer filmId, Integer filmTMDB,String filmName, String filmTagLine,String filmGenres, String filmOverview, Double filmPopularity,Double filmRating, String filmPosterURL, String filmWebsite, String filmProduction, String filmRuntime, List<ShowingDto> showings) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.showings = showings;
        this.filmTMDB = filmTMDB;
        this.filmTagLine = filmTagLine;
        this.filmGenres = filmGenres;
        this.filmOverview = filmOverview;
        this.filmPopularity = filmPopularity;
        this.filmRating = filmRating;
        this.filmPosterURL = filmPosterURL;
        this.filmWebsite = filmWebsite;
        this.filmRuntime = filmRuntime;
        this.filmProduction = filmProduction;

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

    public String getFilmWebsite() {
        return filmWebsite;
    }

    public void setFilmWebsite(String filmWebsite) {
        this.filmWebsite = filmWebsite;
    }

    public String getFilmTagLine() {
        return filmTagLine;
    }

    public void setFilmTMDB(Integer filmTMDB) {
        this.filmTMDB = filmTMDB;
    }

    public String getFilmPosterURL() {
        return filmPosterURL;
    }

    public void setFilmTagLine(String filmTagLine) {
        this.filmTagLine = filmTagLine;
    }

    public String getFilmProduction() {
        return filmProduction;
    }

    public void setFilmRating(Double filmRating) {
        this.filmRating = filmRating;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public void setFilmProduction(String filmProduction) {
        this.filmProduction = filmProduction;
    }

    public String getFilmGenres() {
        return filmGenres;
    }

    public void setFilmPosterURL(String filmPosterURL) {
        this.filmPosterURL = filmPosterURL;
    }

    public Integer getFilmTMDB() {
        return filmTMDB;
    }

    public void setFilmPopularity(Double filmPopularity) {
        this.filmPopularity = filmPopularity;
    }

    public Double getFilmRating() {
        return filmRating;
    }

    public void setFilmOverview(String filmOverview) {
        this.filmOverview = filmOverview;
    }

    public Double getFilmPopularity() {
        return filmPopularity;
    }

    public String getFilmRuntime() {
        return filmRuntime;
    }

    public void setFilmRuntime(String filmRuntime) {
        this.filmRuntime = filmRuntime;
    }

    public void setFilmGenres(String filmGenres) {
        this.filmGenres = filmGenres;
    }

}
