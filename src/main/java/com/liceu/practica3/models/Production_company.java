package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Production_company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    @Nullable
    private String company_name;

    @OneToMany(mappedBy = "company_id")
    Set<Movie_company> movie_companies;

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    @Nullable
    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(@Nullable String company_name) {
        this.company_name = company_name;
    }

    public Set <Movie_company> getMovie_companies() {
        return movie_companies;
    }

    public void setMovie_companies(Set <Movie_company> movie_companies) {
        this.movie_companies = movie_companies;
    }
}
