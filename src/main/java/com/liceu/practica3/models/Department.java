package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;

    @Nullable
    private String department_name;

    @OneToMany(mappedBy = "department_id")
    Set<Movie_crew> movie_crews;

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    @Nullable
    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(@Nullable String department_name) {
        this.department_name = department_name;
    }

    public Set <Movie_crew> getMovie_crews() {
        return movie_crews;
    }

    public void setMovie_crews(Set <Movie_crew> movie_crews) {
        this.movie_crews = movie_crews;
    }
}
