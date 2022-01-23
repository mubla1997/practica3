package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_languagesRepo extends JpaRepository<Movie_languages, Long> {
}
