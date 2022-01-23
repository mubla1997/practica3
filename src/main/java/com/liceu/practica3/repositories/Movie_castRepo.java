package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_castRepo extends JpaRepository<Movie_cast, Long> {
}
