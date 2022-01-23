package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long language_id;

    @Nullable
    private String language_code;

    @Nullable
    private String language_name;

    @OneToMany(mappedBy = "language")
    Set<Movie_languages> movie_languages;

    public Long getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Long language_id) {
        this.language_id = language_id;
    }

    @Nullable
    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(@Nullable String language_code) {
        this.language_code = language_code;
    }

    @Nullable
    public String getLanguage_name() {
        return language_name;
    }

    public void setLanguage_name(@Nullable String language_name) {
        this.language_name = language_name;
    }

    public Set <Movie_languages> getMovie_languages() {
        return movie_languages;
    }

    public void setMovie_languages(Set <Movie_languages> movie_languages) {
        this.movie_languages = movie_languages;
    }
}
