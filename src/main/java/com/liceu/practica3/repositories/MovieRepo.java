package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
    @Query(nativeQuery = true, value = "Select * from movie where title = :title")
    List <Movie> FindByTitle(@Param("title")String title);

    @Query(nativeQuery = true, value = "select * from movie as m inner join movie_cast as mc on " +
            "m.movie_id = mc.movie_id left join person p on p.person_id = mc.person_id where " +
            "person_name = :person_name")
    List<Movie> FindByActor(@Param("person_name")String person_name);

    @Query(nativeQuery = true, value = "select * from movie as m inner join movie_cast as mc on " +
            "m.movie_id = mc.movie_id where character_name = :character_name ;")
    List<Movie> FindByCharacter(@Param("character_name")String character_name);

    @Query(nativeQuery = true, value = "select * from movie as m inner join movie_genres as mg on " +
            "m.movie_id = mg.movie_id inner join genre g on g.genre_id = mg.genre_id where genre_name = :genre_name")
    List<Movie> FindByGenre(@Param("genre_name")String genre_name);

    @Query(nativeQuery = true, value = "select * from movie as m inner join movie_crew as mc on m.movie_id = mc.movie_id " +
            "left join person p on p.person_id = mc.person_id where person_name = :person_name" )
    List<Movie> FindByDirector(@Param("person_name")String person_name);
}