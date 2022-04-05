package com.kelmorgan.mynetflux.bootstrap;

import com.kelmorgan.mynetflux.domain.Movie;
import com.kelmorgan.mynetflux.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
public class InitMovies implements CommandLineRunner {

    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
        movieRepository.deleteAll()
                .thenMany(
                        Flux.just("Silence of the Lambdas","Aeon Flux","Enter the Mono<Void>","Lord of the Fluxes","Back to the future")
                                .map(Movie::new)
                                .flatMap(movieRepository::save)
                ).subscribe(null,null,()->movieRepository.findAll().subscribe(System.out::println));
    }
}
