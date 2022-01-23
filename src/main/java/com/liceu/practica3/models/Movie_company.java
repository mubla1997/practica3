package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_company {
  @Embeddable
  public static class PK implements Serializable{
      @Column(nullable = false, updatable = false)
      private Long movie_id;

      @Column(nullable = false, updatable = false)
      private Long company_id;

      public PK(){}

      public PK(Long movie_id, Long company_id){
          this.movie_id = movie_id;
          this.company_id = company_id;
      }

      public Long getMovie_id() {
          return movie_id;
      }

      public void setMovie_id(Long movie_id) {
          this.movie_id = movie_id;
      }

      public Long getCompany_id() {
          return company_id;
      }

      public void setCompany_id(Long company_id) {
          this.company_id = company_id;
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
    @JoinColumn(name = "company_id", insertable = false, updatable = false,nullable = true)
    private Production_company production_company;

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
    public Production_company getProduction_company() {
        return production_company;
    }

    public void setProduction_company(@Nullable Production_company production_company) {
        this.production_company = production_company;
    }
}
