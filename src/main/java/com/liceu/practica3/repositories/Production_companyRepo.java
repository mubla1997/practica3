package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Production_company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Production_companyRepo extends JpaRepository<Production_company, Long> {
}
