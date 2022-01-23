package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepo extends JpaRepository<Language, Long> {
}
