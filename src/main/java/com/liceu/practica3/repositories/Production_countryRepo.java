package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Production_country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Production_countryRepo extends JpaRepository<Production_country, Long> {
}
