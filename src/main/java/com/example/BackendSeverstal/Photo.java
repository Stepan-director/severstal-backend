package com.example.BackendSeverstal;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "name")
    private String name;

    public Photo() {
    }

    public Photo(Long id, LocalDate dob, String name) {
        this.id = id;
        this.dob = dob;
        this.name = name;
    }

    public Photo(LocalDate dob, String name) {
        this.dob = dob;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", dob=" + dob +
                ", name='" + name + '\'' +
                '}';
    }
}
