package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Movie_genreRepo extends JpaRepository<Movie_genre, Long> {
}
