package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_languages {
    @Embeddable
    public static class PK implements Serializable{
        @Column(nullable = false,updatable = false)
        private Long movie_id;

        @Column(nullable = false,updatable = false)
        private Long language_id;

        @Column(nullable = false,updatable = false)
        private Long language_role_id;

        public PK(){}

        public Long getMovie_id() {
            return movie_id;
        }

        public void setMovie_id(Long movie_id) {
            this.movie_id = movie_id;
        }

        public Long getLanguage_id() {
            return language_id;
        }

        public void setLanguage_id(Long language_id) {
            this.language_id = language_id;
        }

        public Long getLanguage_role_id() {
            return language_role_id;
        }

        public void setLanguage_role_id(Long language_role_id) {
            this.language_role_id = language_role_id;
        }

        public PK(Long movie_id, Long language_id, Long language_role_id){
            this.movie_id = movie_id;
            this.language_id = language_id;
            this.language_role_id = language_role_id;


        }
    }
    @EmbeddedId
    private PK pk;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "movie_id", insertable = false, updatable = false,nullable = true)
    private Movie movie;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "language_id", insertable = false, updatable = false,nullable = true)
    private Language language;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "language_role_id", insertable = false, updatable = false,nullable = true)
    private Language_role language_role;

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
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(@Nullable Language language) {
        this.language = language;
    }

    @Nullable
    public Language_role getLanguage_role() {
        return language_role;
    }

    public void setLanguage_role(@Nullable Language_role language_role) {
        this.language_role = language_role;
    }
}
