package com.qa.cinema.persistence.domain;

import javax.persistence.*;

@Entity
public class Showing {
    
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer showingId;
    @Column
    private String showingTime;
    @ManyToOne
    private Film film;

    public Showing(String showingName) {
		this.showingTime = showingName;
	}

	public Integer getShowingId() {
        return showingId;
    }

    public void setShowingId(Integer showingId) {
        this.showingId = showingId;
    }

    public String getShowingName() {
        return showingTime;
    }

    public void setShowingName(String showingName) {
        this.showingTime = showingName;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Showing() {
    }

    public Showing(String showingName, Film film) {
        this.showingTime = showingName;
        this.film = film;
    }
}
