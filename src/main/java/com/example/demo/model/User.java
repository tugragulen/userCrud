package com.example.demo.model;

import com.example.demo.util.IdSequencer;

public class User {
    private long id;
    private String name;
    private String surname;
    private String username;

    public User(String name, String surname, String username) {
        this.id = IdSequencer.getId();
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return String.format(
                "ID = {%d}, Name = {%s}, Surname = {%s}, Username = {%s}", id, this.name, this.surname, this.username);
    }
}
