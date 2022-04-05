package com.kelmorgan.mynetflux.services;

import com.kelmorgan.mynetflux.domain.Movie;
import com.kelmorgan.mynetflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Mono<Movie> getMoviesById(String id);

    Flux<Movie> getAllMovies();

    Flux<MovieEvent> streamMovieEvents(String id);
}
