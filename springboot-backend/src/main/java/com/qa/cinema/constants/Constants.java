package com.qa.cinema.constants;

public interface Constants {
	static final String GET_FILM_BY_ID = "/getFilm/{filmId}";
	static final String GET_ALL_FILMS = "/getAllFilms";
	static final String SAVE_FILM = "/saveFilm";
	static final String FILM = "/film";
	static final String TMDB = "/tmdb";
	static final String HOME = "/home";
	static final String INDEX = "index";
	static final String TMDB_API = "1fa36fc7ed8328af5bc485a7b227ec58";
	static final String TMDB_CURRENT= "/current";
	static final String TMDB_UPCOMING = "/upcoming";
	static final String TMDB_POPULAR = "/popular";
	static final String TMDB_SEARCH = "/search/{name}";
	static final String TMDB_GET_FILM_BY_ID = "/getById/{id}";
	static final String GET_SHOWING_BY_ID = "/getShowing/{showingId}";
	static final String GET_ALL_SHOWINGS = "/getAllShowings";
	static final String SAVE_SHOWING = "/saveShowing";
	static final String GET_SHOWINGS_BY_TMDB = "/getShowingByTMDB/{tmdb}";
	static final String SHOWING = "/showing";
	static final String ADMIN = "/admin";
	static final String SAVE_ADMIN = "/saveAdmin";
	static final String GET_ALL_ADMIN = "/getAllAdmin";
	static final String LOGIN_ADMIN = "/loginAdmin/{adminName}/{adminPassword}";
	static final String DELETE = "/delete/{id}";
}
