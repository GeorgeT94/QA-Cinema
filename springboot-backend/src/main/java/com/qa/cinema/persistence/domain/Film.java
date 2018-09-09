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
    private String filmPosterURL;


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



    public Integer getFilmTMDB() {
        return filmTMDB;
    }


    public String getFilmPosterURL() {
        return filmPosterURL;
    }



    public void setFilmPosterURL(String filmPosterURL) {
        this.filmPosterURL = filmPosterURL;
    }



    public void setFilmTMDB(Integer filmTMDB) {
        this.filmTMDB = filmTMDB;
    }


    public Film() {
    }

    public Film(Integer filmTMDB,String filmName, String filmPosterURL) {
        this.filmName = filmName;
        this.filmTMDB = filmTMDB;
        this.filmPosterURL = filmPosterURL;
    }
}
