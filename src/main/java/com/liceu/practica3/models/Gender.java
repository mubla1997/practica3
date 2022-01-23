package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gender_id;

    @Nullable
    private String gender;

    @OneToMany(mappedBy = "gender")
    Set<Movie_cast> movie_casts;

    public Long getGender_id() {
        return gender_id;
    }

    public void setGender_id(Long gender_id) {
        this.gender_id = gender_id;
    }

    @Nullable
    public String getGender() {
        return gender;
    }

    public void setGender(@Nullable String gender) {
        this.gender = gender;
    }

    public Set <Movie_cast> getMovie_casts() {
        return movie_casts;
    }

    public void setMovie_casts(Set <Movie_cast> movie_casts) {
        this.movie_casts = movie_casts;
    }
}
