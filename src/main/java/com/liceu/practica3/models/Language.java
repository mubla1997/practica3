package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long language_id;

    @Nullable
    String language_code;

    @Nullable
    String language_name;

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
}
