package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long keyword_id;

    @Nullable
    String keyword_name;

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
}
