package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_genre {
    @Embeddable
    public static class PK implements Serializable{
        @Column(nullable = false, updatable = false)
        private Long movie_id;

        @Column(nullable = false, updatable = false)
        private Long genre_id;

        public PK(){}

        public PK(Long movie_id, Long genre_id){
            this.movie_id = movie_id;
            this.genre_id = genre_id;
        }

        public Long getMovie_id() {
            return movie_id;
        }

        public void setMovie_id(Long movie_id) {
            this.movie_id = movie_id;
        }

        public Long getGenre_id() {
            return genre_id;
        }

        public void setGenre_id(Long genre_id) {
            this.genre_id = genre_id;
        }
    }
    @EmbeddedId
    private PK pk;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "movie_id", insertable = false,updatable = false,nullable = true)
    private Movie movie;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "genre_id", insertable = false,updatable = false,nullable = true)
    private Genre genre;

    public PK getPk() {
        return pk;
    }

    public void setPk(PK pk) {
        this.pk = pk;
    }

    @Nullable
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(@Nullable Movie movie) {
        this.movie = movie;
    }

    @Nullable
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(@Nullable Genre genre) {
        this.genre = genre;
    }
}
