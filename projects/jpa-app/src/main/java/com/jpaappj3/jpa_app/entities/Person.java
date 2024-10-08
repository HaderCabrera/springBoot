package com.jpaappj3.jpa_app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastname;
    private String programmingLenguage;

    
    public Person() {
    }

    public Person(Long id, String name, String lastname, String programmingLenguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLenguage = programmingLenguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProgrammingLenguage() {
        return programmingLenguage;
    }

    public void setProgrammingLenguage(String programmingLenguage) {
        this.programmingLenguage = programmingLenguage;
    }

    
}
