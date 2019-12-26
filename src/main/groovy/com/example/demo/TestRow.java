package com.example.demo;

import javax.persistence.*;

@Entity
public class TestRow {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "naziv")
    String naziv;

    TestRow() {}

    TestRow(String naziv) {
        this.naziv = naziv;
    }

    TestRow(long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
