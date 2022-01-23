package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;

    @Nullable
    private String title;

    @Nullable
    private int budget;

    @Nullable
    private String homepage;

    @Nullable
    private String overview;

    @Nullable
    private Double popularity;

    @Nullable
    private Date release_date;

    @Nullable
    private BigInteger revenue;

    @Nullable
    private int runtime;

    @Nullable
    private String movie_status;

    @Nullable
    private String tagline;

    @Nullable
    private Double vote_average;

    @Nullable
    private int vote_count;

    @OneToMany(mappedBy = "movie")
    Set<Movie_crew> movie_crews;

    @OneToMany(mappedBy = "movie")
    Set<Movie_cast> movie_casts;

    @OneToMany(mappedBy = "movie")
    Set<Movie_company> movie_companies;

    @OneToMany(mappedBy = "movie")
    Set<Production_country> production_countries;

    @OneToMany(mappedBy = "movie")
    Set<Movie_languages> movie_languages;

    @OneToMany(mappedBy = "movie")
    Set<Movie_genre> movie_genres;

    @OneToMany(mappedBy = "movie")
    Set<Movie_keywords> movie_keywords;

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    public void setTitle(@Nullable String title) {
        this.title = title;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Nullable
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(@Nullable String homepage) {
        this.homepage = homepage;
    }

    @Nullable
    public String getOverview() {
        return overview;
    }

    public void setOverview(@Nullable String overview) {
        this.overview = overview;
    }

    @Nullable
    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(@Nullable Double popularity) {
        this.popularity = popularity;
    }

    @Nullable
    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(@Nullable Date release_date) {
        this.release_date = release_date;
    }

    @Nullable
    public BigInteger getRevenue() {
        return revenue;
    }

    public void setRevenue(@Nullable BigInteger revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Nullable
    public String getMovie_status() {
        return movie_status;
    }

    public void setMovie_status(@Nullable String movie_status) {
        this.movie_status = movie_status;
    }

    @Nullable
    public String getTagline() {
        return tagline;
    }

    public void setTagline(@Nullable String tagline) {
        this.tagline = tagline;
    }

    @Nullable
    public Double getVote_average() {
        return vote_average;
    }

    public void setVote_average(@Nullable Double vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public Set <Movie_crew> getMovie_crews() {
        return movie_crews;
    }

    public void setMovie_crews(Set <Movie_crew> movie_crews) {
        this.movie_crews = movie_crews;
    }

    public Set <Movie_cast> getMovie_casts() {
        return movie_casts;
    }

    public void setMovie_casts(Set <Movie_cast> movie_casts) {
        this.movie_casts = movie_casts;
    }

    public Set <Movie_company> getMovie_companies() {
        return movie_companies;
    }

    public void setMovie_companies(Set <Movie_company> movie_companies) {
        this.movie_companies = movie_companies;
    }

    public Set <Production_country> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(Set <Production_country> production_countries) {
        this.production_countries = production_countries;
    }

    public Set <Movie_languages> getMovie_languages() {
        return movie_languages;
    }

    public void setMovie_languages(Set <Movie_languages> movie_languages) {
        this.movie_languages = movie_languages;
    }

    public Set <Movie_genre> getMovie_genres() {
        return movie_genres;
    }

    public void setMovie_genres(Set <Movie_genre> movie_genres) {
        this.movie_genres = movie_genres;
    }

    public Set <Movie_keywords> getMovie_keywords() {
        return movie_keywords;
    }

    public void setMovie_keywords(Set <Movie_keywords> movie_keywords) {
        this.movie_keywords = movie_keywords;
    }
}
