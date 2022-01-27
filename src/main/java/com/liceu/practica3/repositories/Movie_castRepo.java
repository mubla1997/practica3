package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Movie_cast;
import com.liceu.practica3.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Movie_castRepo extends JpaRepository<Movie_cast, Long> {

    @Query(nativeQuery = true,value = "select * from movie where title = :%title% group by m.movie_id")
    Movie getMovie(@Param("title")String title);

    @Query(nativeQuery = true, value = "select *  from person where person_name = %:person_name% group by p.person_id;")
    Person getPerson(@Param("person_name")String person_name);
}
