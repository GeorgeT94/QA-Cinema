package com.qa.cinema.persistence.domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table
public class Film{
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer filmId;
    @Column
    private Integer filmTMDB;
    @Column
    private String filmName;
    @Column
    private String filmTagLine;
    @Column
    private String filmGenres;
    @Column
    private String filmOverview;
    @Column
    private Double filmPopularity;
    @Column
    private Double filmRating;
    @Column
    private String filmPosterURL;
    @Column
    private String filmWebsite;
    @Column
    private String filmRuntime;
    @Column
    private String filmProduction;



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Showing> showings;


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
        return showings;
    }

    public void setShowings(List<Showing> Showings) {
        this.showings = showings;
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

    public String getFilmGenres() {
        return filmGenres;
    }

    public String getFilmOverview() {
        return filmOverview;
    }

    public String getFilmProduction() {
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

    public void setFilmGenres(String filmGenres) {
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

    public void setFilmProduction(String filmProduction) {
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

    public String getFilmRuntime() {
        return filmRuntime;
    }

    public void setFilmRuntime(String filmRuntime) {
        this.filmRuntime = filmRuntime;
    }

    public Film() {
    }

    public Film(Integer filmTMDB,String filmName, String filmTagLine,String filmGenres, String filmOverview, Double filmPopularity,Double filmRating, String filmPosterURL, String filmWebsite, String filmProduction, String filmRuntime, List<Showing> showings) {
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
}
