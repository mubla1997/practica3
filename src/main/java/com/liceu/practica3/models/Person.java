package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long person_id;

    @Nullable
    private String person_name;

    @OneToMany(mappedBy = "person")
    Set <Movie_crew> movie_crews;

    @OneToMany(mappedBy = "person")
    Set<Movie_cast> movie_casts;

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    @Nullable
    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(@Nullable String person_name) {
        this.person_name = person_name;
    }

    public Set <Movie_crew> getMovie_crews() {
        return movie_crews;
    }

    public void setMovie_crews(Set <Movie_crew> movie_crews) {
        this.movie_crews = movie_crews;
    }

    public Set <Movie_cast> getMovie_casts() {
        return movie_casts;
    }

    public void setMovie_casts(Set <Movie_cast> movie_casts) {
        this.movie_casts = movie_casts;
    }
}
