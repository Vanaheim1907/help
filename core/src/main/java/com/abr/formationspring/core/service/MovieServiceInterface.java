package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;

public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
    Movie getMovieById(long id);
}
