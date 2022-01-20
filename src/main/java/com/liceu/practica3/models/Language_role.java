package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Language_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @Nullable
    private String language_role;

    @OneToMany(mappedBy = "language_role_id")
    Set<Movie_languages> movie_languages;

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    @Nullable
    public String getLanguage_role() {
        return language_role;
    }

    public void setLanguage_role(@Nullable String language_role) {
        this.language_role = language_role;
    }

    public Set <Movie_languages> getMovie_languages() {
        return movie_languages;
    }

    public void setMovie_languages(Set <Movie_languages> movie_languages) {
        this.movie_languages = movie_languages;
    }
}
