package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepo extends JpaRepository<Keyword, Long> {
}
