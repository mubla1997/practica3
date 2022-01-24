package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query(nativeQuery = true, value = "select * from person order by person_id desc limit 1 ")
    Person obtainMaxId();
}


