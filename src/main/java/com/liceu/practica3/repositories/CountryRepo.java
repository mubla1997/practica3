package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Long> {
}
