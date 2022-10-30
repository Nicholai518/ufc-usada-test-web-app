package com.nicholaspazienza.ufcusadatestapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "usada_test_counts")
public class UsadaTestCount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "year")
    int year;

    @Column(name = "total")
    int total;

    @Column(name = "fighter_id")
    int fighterId;

    // need a default constructor
    public UsadaTestCount() {
    }

    public UsadaTestCount(int year, int total, int fighterId) {
        this.year = year;
        this.total = total;
        this.fighterId = fighterId;
    }

    // getters
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getTotal() {
        return total;
    }

    public int getFighterId() {
        return fighterId;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setFighterId(int fighterId) {
        this.fighterId = fighterId;
    }

    @Override
    public String toString() {
        return "UsadaTestCount{" +
                "id=" + id +
                ", year='" + year + "'" +
                ", total='" + total + "'" +
                ", fighterId='" + fighterId + "'" +
                '}';
    }
}