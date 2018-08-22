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
    private String filmName;
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

    public Film() {
    }

    public Film(String filmName, List<Showing> Showings) {
        this.filmName = filmName;
        this.Showings = Showings;
    }
}
