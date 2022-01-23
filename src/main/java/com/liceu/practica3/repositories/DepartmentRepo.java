package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
