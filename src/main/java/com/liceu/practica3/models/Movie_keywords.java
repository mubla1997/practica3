package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_keywords {
    @Embeddable
    public static class PK implements Serializable{
        @Column(nullable = false, updatable = false)
            private Long movie_id;

        @Column(nullable = false, updatable = false)
        private Long keyword_id;

        public PK(){}

        public PK(Long movie_id, Long keyword_id){
            this.movie_id = movie_id;
            this.keyword_id = keyword_id;
        }

        public Long getMovie_id() {
            return movie_id;
        }

        public void setMovie_id(Long movie_id) {
            this.movie_id = movie_id;
        }

        public Long getKeyword_id() {
            return keyword_id;
        }

        public void setKeyword_id(Long keyword_id) {
            this.keyword_id = keyword_id;
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
    @JoinColumn(name = "keyword_id", insertable = false, updatable = false,nullable = true)
    private Keyword keyword;

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
    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(@Nullable Keyword keyword) {
        this.keyword = keyword;
    }
}
