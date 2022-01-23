package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
