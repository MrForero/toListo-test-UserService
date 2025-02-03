package com.example.test.toListo.infrastructure.controllers.dto;

public class UserDto {
    private String Id;
    private String name;
    private String lastName;
    private String email;

    public UserDto() {
    }

    public UserDto(String Id, String name, String lastName, String email) {
        this.Id = Id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
