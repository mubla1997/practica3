package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie_crew {
    @Embeddable
    public static class PK implements Serializable{
        @Column(nullable = false, updatable = false)
        private Long person_id;

        @Column(nullable = false, updatable = false)
        private Long movie_id;

        @Column(nullable = false, updatable = false)
        private Long department_id;

        public PK(){}

        public PK(Long person_id, Long movie_id, Long department_id){
            this.person_id = person_id;
            this.movie_id = movie_id;
            this.department_id = department_id;
        }

        public Long getPerson_id() {
            return person_id;
        }

        public void setPerson_id(Long person_id) {
            this.person_id = person_id;
        }

        public Long getMovie_id() {
            return movie_id;
        }

        public void setMovie_id(Long movie_id) {
            this.movie_id = movie_id;
        }

        public Long getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(Long department_id) {
            this.department_id = department_id;
        }

    }

    @EmbeddedId
    private PK pk;

    @Nullable
    @ManyToOne
    @JoinColumn(name ="department_id", insertable = false, updatable = false,nullable = true)
    private Department department;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "movie_id", insertable = false, updatable = false, nullable = true)
    private Movie movie;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "person_id", insertable = false, updatable = false, nullable = true)
    private Person person;

    @Nullable
    private String job;

    public PK getPk() {
        return pk;
    }

    public void setPk(PK pk) {
        this.pk = pk;
    }

    @Nullable
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(@Nullable Department department) {
        this.department = department;
    }

    @Nullable
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(@Nullable Movie movie) {
        this.movie = movie;
    }

    @Nullable
    public Person getPerson() {
        return person;
    }

    public void setPerson(@Nullable Person person) {
        this.person = person;
    }

    @Nullable
    public String getJob() {
        return job;
    }

    public void setJob(@Nullable String job) {
        this.job = job;
    }
}
