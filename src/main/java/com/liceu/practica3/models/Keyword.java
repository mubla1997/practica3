package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long keyword_id;

    @Nullable
    private String keyword_name;

    @OneToMany(mappedBy = "keyword")
    Set<Movie_keywords> movie_keywords;

    public Long getKeyword_id() {
        return keyword_id;
    }

    public void setKeyword_id(Long keyword_id) {
        this.keyword_id = keyword_id;
    }

    @Nullable
    public String getKeyword_name() {
        return keyword_name;
    }

    public void setKeyword_name(@Nullable String keyword_name) {
        this.keyword_name = keyword_name;
    }

    public Set <Movie_keywords> getMovie_keywords() {
        return movie_keywords;
    }

    public void setMovie_keywords(Set <Movie_keywords> movie_keywords) {
        this.movie_keywords = movie_keywords;
    }
}
