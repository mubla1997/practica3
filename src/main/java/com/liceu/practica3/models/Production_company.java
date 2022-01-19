package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Production_company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int company_id;

    @Nullable
    String company_name;

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    @Nullable
    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(@Nullable String company_name) {
        this.company_name = company_name;
    }
}
