package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {
}
