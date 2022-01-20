package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_cast {
    @Embeddable
    public static class PK implements Serializable{
        @Column(nullable = false, updatable = false)
        private Long movie_id;

        @Column(nullable = false,updatable = false)
        private Long gender_id;

        @Column(nullable = false, updatable = false)
        private Long person_id;

        public PK(){}

        public PK(Long movie_id, Long gender_id, Long person_id){
            this.movie_id = movie_id;
            this.gender_id = gender_id;
            this.person_id = person_id;
        }

        public Long getMovie_id() {
            return movie_id;
        }

        public void setMovie_id(Long movie_id) {
            this.movie_id = movie_id;
        }

        public Long getGender_id() {
            return gender_id;
        }

        public void setGender_id(Long gender_id) {
            this.gender_id = gender_id;
        }

        public Long getPerson_id() {
            return person_id;
        }

        public void setPerson_id(Long person_id) {
            this.person_id = person_id;
        }
    }

    @EmbeddedId
    private PK pk;

    @ManyToOne
    @JoinColumn(name ="movie_id", insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name ="gender_id", insertable = false, updatable  = false)
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    @Nullable
    private String cast_name;

    @Nullable
    private int cast_order;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Nullable
    public String getCast_name() {
        return cast_name;
    }

    public void setCast_name(@Nullable String cast_name) {
        this.cast_name = cast_name;
    }

    public int getCast_order() {
        return cast_order;
    }

    public void setCast_order(int cast_order) {
        this.cast_order = cast_order;
    }
}
