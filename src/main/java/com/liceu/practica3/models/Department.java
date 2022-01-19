package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int department_id;

    @Nullable
    String department_name;

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    @Nullable
    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(@Nullable String department_name) {
        this.department_name = department_name;
    }
}
