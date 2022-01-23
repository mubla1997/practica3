package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_crew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_crewRepo extends JpaRepository<Movie_crew, Long> {
}
