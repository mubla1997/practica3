package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender, Long> {
}
