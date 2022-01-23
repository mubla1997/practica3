package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Production_country {
   @Embeddable
   public static class PK implements Serializable{
       @Column(nullable = false, updatable = false)
       private Long movie_id;

       @Column(nullable = false, updatable = false)
       private Long country_id;

       public PK(){}

       public PK(Long movie_id, Long country_id){
           this.movie_id = movie_id;
           this.country_id = country_id;
       }

       public Long getMovie_id() {
           return movie_id;
       }

       public void setMovie_id(Long movie_id) {
           this.movie_id = movie_id;
       }

       public Long getCountry_id() {
           return country_id;
       }

       public void setCountry_id(Long country_id) {
           this.country_id = country_id;
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
    @JoinColumn(name = "country_id", insertable = false, updatable = false,nullable = true)
    private Country country;

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
    public Country getCountry() {
        return country;
    }

    public void setCountry(@Nullable Country country) {
        this.country = country;
    }
}
