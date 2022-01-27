package com.liceu.practica3.repositories;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
    @Query(nativeQuery = true, value = "Select * from movie where title like %:title%")
    List <Movie> FindByTitle(@Param("title")String title);

    @Query(nativeQuery = true, value = "select m.* from movie as m inner join movie_cast as mc on " +
            "m.movie_id = mc.movie_id left join person p on p.person_id = mc.person_id where " +
            "person_name = :person_name")
    List<Movie> FindByActor(@Param("person_name")String person_name);

    @Query(nativeQuery = true, value = "select m.* from movie as m inner join movie_cast as mc on " +
            "m.movie_id = mc.movie_id where character_name = :character_name ")
    List<Movie> FindByCharacter(@Param("character_name")String character_name);

    @Query(nativeQuery = true, value = "select m.* from movie as m inner join movie_genres as mg on " +
            "m.movie_id = mg.movie_id inner join genre as g on g.genre_id = mg.genre_id where genre_name = :genre_name")
    List<Movie> FindByGenre(@Param("genre_name")String genre_name);

    @Query(nativeQuery = true, value = "select m.* from movie as m inner join movie_crew as mc on m.movie_id = mc.movie_id " +
            "left join person p on p.person_id = mc.person_id where person_name = :person_name and job = 'Director'" )
    List<Movie> FindByDirector(@Param("person_name")String person_name);

    @Query(nativeQuery = true, value = "select person_name from person as p left join movie_cast as mc on " +
            "p.person_id = mc.person_id inner join movie m on m.movie_id = mc.movie_id where " +
            "person_name like %:person_name% group by person_name")
    List<String> FindAllActors(@Param("person_name")String person_name);

    @Query(nativeQuery = true, value = "select * from movie order by movie_id desc limit 10")
    List<Movie> listMovieLimit10();

    @Query(nativeQuery = true, value = "select character_name from movie_cast as mc inner join movie as m on " +
            "m.movie_id = mc.movie_id where character_name like %:character_name% group by character_name")
    List<String> FindAllCharacters(@Param("character_name")String character_name);

    @Query(nativeQuery = true, value = "select title from movie where title like %:title% group by title")
    List <String> FindAllTitles(@Param("title")String title);

    @Query(nativeQuery = true,value = "select person_name from person as p left join movie_crew as mc on " +
            "p.person_id = mc.person_id inner join movie m on m.movie_id = mc.movie_id where " +
            " person_name like %:person_name% group by person_name and job = 'Director'")
    List<String> FindAllDirectors(@Param("person_name")String person_name);
}