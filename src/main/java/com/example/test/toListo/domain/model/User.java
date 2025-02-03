package com.example.test.toListo.domain.model;

import jakarta.persistence.Id;

public class User {

    @Id
    private String Id;
    private String name;
    private String lastName;
    private String email;

    public User() {
    }

    public User(String id, String name, String lastName, String email) {
        Id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
