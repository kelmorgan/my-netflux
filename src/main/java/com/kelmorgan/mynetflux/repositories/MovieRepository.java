package com.kelmorgan.mynetflux.repositories;

import com.kelmorgan.mynetflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie,String> {
}
