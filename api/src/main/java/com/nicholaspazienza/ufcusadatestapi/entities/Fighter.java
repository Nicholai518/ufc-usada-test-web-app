package com.nicholaspazienza.ufcusadatestapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "ufc_fighters")
public class Fighter {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "first_name")
    String firstname;
    @Column(name = "last_name")
    String lastname;

    // constructor
    public Fighter() {}

    public Fighter(String firstname, String lastname) {
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

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "fighter{" +
                "id=" + id +
                ", firstname='" + firstname + "'" +
                ", lastname='" + lastname + "'" +
                '}';
    }
}
