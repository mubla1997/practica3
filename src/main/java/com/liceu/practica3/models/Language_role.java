package com.liceu.practica3.models;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int role_id;

    @Nullable
    String language_role;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Nullable
    public String getLanguage_role() {
        return language_role;
    }

    public void setLanguage_role(@Nullable String language_role) {
        this.language_role = language_role;
    }
}
