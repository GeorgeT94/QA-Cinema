package com.qa.cinema.rest;

import com.uwetrottmann.tmdb2.Tmdb;
import com.uwetrottmann.tmdb2.entities.Movie;
import com.uwetrottmann.tmdb2.entities.MovieResultsPage;
import com.uwetrottmann.tmdb2.services.MoviesService;
import com.uwetrottmann.tmdb2.services.SearchService;
import org.springframework.web.bind.annotation.*;
import retrofit2.Call;
import retrofit2.Response;
import com.qa.cinema.constants.Constants;


import java.io.IOException;

@RestController
@RequestMapping(value = Constants.TMDB)
public class TMDBController {
    Tmdb tmdb = new Tmdb(Constants.TMDB_API);
    MoviesService moviesService = tmdb.moviesService();
    SearchService searchService = tmdb.searchService();

    @CrossOrigin
    @RequestMapping(value = Constants.TMDB_CURRENT, method = RequestMethod.GET)
    public MovieResultsPage getCurrent()throws IOException {
            Call<MovieResultsPage> call = moviesService
                    .nowPlaying(null,null);

            MovieResultsPage page = call.execute().body();

        return page;
    }

    @CrossOrigin
    @RequestMapping(value = Constants.TMDB_UPCOMING, method = RequestMethod.GET)
    public MovieResultsPage getUpcoming() throws IOException {
        Call<MovieResultsPage> call = moviesService
                .upcoming(null,null);

        MovieResultsPage page = call.execute().body();

        return page;
    }

    @CrossOrigin
    @RequestMapping(value = Constants.TMDB_SEARCH, method = RequestMethod.GET)
    public MovieResultsPage getSearchResults(@PathVariable String name) throws IOException {
        Call<MovieResultsPage> call = searchService.movie(name,null,null,null,null, null, null);
        MovieResultsPage page = call.execute().body();
        return page;
    }

    @CrossOrigin
    @RequestMapping(value = Constants.TMDB_GET_FILM_BY_ID, method = RequestMethod.GET)
    public Movie getFilmById(@PathVariable int id) throws IOException {
        Response<Movie> call = moviesService.summary(id).execute();

        return call.body();
    }
}
