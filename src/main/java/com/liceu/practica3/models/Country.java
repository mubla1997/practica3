package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long country_id;

    @Nullable
    String country_iso_code;

    @Nullable
    String country_name;

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    @Nullable
    public String getCountry_iso_code() {
        return country_iso_code;
    }

    public void setCountry_iso_code(@Nullable String country_iso_code) {
        this.country_iso_code = country_iso_code;
    }

    @Nullable
    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(@Nullable String country_name) {
        this.country_name = country_name;
    }
}
