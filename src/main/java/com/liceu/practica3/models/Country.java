package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long country_id;

    @Nullable
    private String country_iso_code;

    @Nullable
    private String country_name;

    @OneToMany(mappedBy = "country_id")
    Set<Production_country> production_countries;

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

    public Set <Production_country> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(Set <Production_country> production_countries) {
        this.production_countries = production_countries;
    }
}
