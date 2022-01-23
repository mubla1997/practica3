package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
