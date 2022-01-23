package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Language_role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Language_roleRepo extends JpaRepository<Language_role, Long> {
}
