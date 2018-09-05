package com.qa.cinema.persistence.domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Film{
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer filmId;
    @Column
    private Integer filmTMDB;
    private String filmName;
    private String filmTagLine;
    private List<String> filmGenres;
    private String filmOverview;
    private Double filmPopularity;
    private Double filmRating;
    private String filmPosterURL;
    private String filmWebsite;
    private String filmRuntime;
    private List<String> filmProduction;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Showing> Showings= new LinkedList<>();


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

    public List<Showing> getShowings() {
        return Showings;
    }

    public void setShowings(List<Showing> Showings) {
        this.Showings = Showings;
    }

    public Double getFilmPopularity() {
        return filmPopularity;
    }

    public Double getFilmRating() {
        return filmRating;
    }

    public Integer getFilmTMDB() {
        return filmTMDB;
    }

    public List<String> getFilmGenres() {
        return filmGenres;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public List<String> getFilmProduction() {
        return filmProduction;
    }

    public String getFilmPosterURL() {
        return filmPosterURL;
    }

    public String getFilmTagLine() {
        return filmTagLine;
    }

    public String getFilmWebsite() {
        return filmWebsite;
    }

    public void setFilmGenres(List<String> filmGenres) {
        this.filmGenres = filmGenres;
    }

    public void setFilmOverview(String filmOverview) {
        this.filmOverview = filmOverview;
    }

    public void setFilmPopularity(Double filmPopularity) {
        this.filmPopularity = filmPopularity;
    }

    public void setFilmPosterURL(String filmPosterURL) {
        this.filmPosterURL = filmPosterURL;
    }

    public void setFilmProduction(List<String> filmProduction) {
        this.filmProduction = filmProduction;
    }

    public void setFilmRating(Double filmRating) {
        this.filmRating = filmRating;
    }

    public void setFilmTagLine(String filmTagLine) {
        this.filmTagLine = filmTagLine;
    }

    public void setFilmTMDB(Integer filmTMDB) {
        this.filmTMDB = filmTMDB;
    }

    public void setFilmWebsite(String filmWebsite) {
        this.filmWebsite = filmWebsite;
    }

    public Film() {
    }

    public Film(Integer filmTMDB,String filmName, String filmTagLine,List<String> filmGenres, String filmOverview, Double filmPopularity,Double filmRating, String filmPosterURL, String filmWebsite, List<String> filmProduction, String filmRuntime, List<Showing> Showings) {
        this.filmName = filmName;
        this.Showings = Showings;
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
}
