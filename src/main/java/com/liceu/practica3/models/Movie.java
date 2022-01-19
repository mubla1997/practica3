package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Date;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int movie_id;

    @Nullable
    String tittle;

    @Nullable
    int budget;

    @Nullable
    String homepage;

    @Nullable
    String overview;

    @Nullable
    Double popularity;

    @Nullable
    Date release_date;

    @Nullable
    BigInteger revenue;

    @Nullable
    int runtime;

    @Nullable
    String movie_status;

    @Nullable
    String tagline;

    @Nullable
    Double vote_average;

    @Nullable
    int vote_count;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    @Nullable
    public String getTittle() {
        return tittle;
    }

    public void setTittle(@Nullable String tittle) {
        this.tittle = tittle;
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
}
