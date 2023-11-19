package com.abr.formationspring.core.repository;


import com.abr.formationspring.core.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
    /*Movie add(Movie movie);
    List<Movie> list();
    Movie getById(long id);*/
}
