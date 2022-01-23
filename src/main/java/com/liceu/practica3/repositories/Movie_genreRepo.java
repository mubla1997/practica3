package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_genreRepo extends JpaRepository<Movie_genres, Long> {
}
