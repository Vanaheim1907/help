package com.abr.formationspring.core.repository;


import com.abr.formationspring.core.entity.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface MovieRepositoryInterface extends CrudRepository<Movie, Long> {
    @Override
    @EntityGraph(value = "movie.actor-and-reviews", type = EntityGraph.EntityGraphType.FETCH)
    Optional<Movie> findById(Long aLong);
}
