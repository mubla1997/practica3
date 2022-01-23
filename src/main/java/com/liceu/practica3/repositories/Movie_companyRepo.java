package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie_company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_companyRepo extends JpaRepository<Movie_company, Long> {
}
