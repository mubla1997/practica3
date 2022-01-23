package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

    @Query(nativeQuery = true, value = "insert into person(person_id, person_name) values (:person_id, :person_name)")
    void createPerson(@Param("person_id") Long person_id, @Param("person_name") String person_name);
}
