package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long genre_id;

    @Nullable
    String genre_name;

    public Long getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Long genre_id) {
        this.genre_id = genre_id;
    }

    @Nullable
    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(@Nullable String genre_name) {
        this.genre_name = genre_name;
    }
}
