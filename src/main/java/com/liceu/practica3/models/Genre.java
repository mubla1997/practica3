package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genre_id;

    @Nullable
    private String genre_name;

    @OneToMany(mappedBy = "genre_id")
    Set<Movie_genre> movie_genres;

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

    public Set <Movie_genre> getMovie_genres() {
        return movie_genres;
    }

    public void setMovie_genres(Set <Movie_genre> movie_genres) {
        this.movie_genres = movie_genres;
    }
}
