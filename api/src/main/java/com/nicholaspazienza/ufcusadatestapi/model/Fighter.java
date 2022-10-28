package com.nicholaspazienza.ufcusadatestapi.model;

public class Fighter {

    // fields
    int id;
    String firstname;
    String lastname;

    // constructor
    public Fighter(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }
}
