package com.liceu.practica3.models;

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

  @ManyToOne
  @JoinColumn(name = "movie_id", insertable = false, updatable = false)
  private Movie movie;

  @ManyToOne
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private Production_company production_company;

    public PK getPk() {
        return pk;
    }

    public void setPk(PK pk) {
        this.pk = pk;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Production_company getProduction_company() {
        return production_company;
    }

    public void setProduction_company(Production_company production_company) {
        this.production_company = production_company;
    }
}
