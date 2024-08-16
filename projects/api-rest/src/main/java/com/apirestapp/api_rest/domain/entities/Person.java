package com.apirestapp.api_rest.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class Person {
    @Id
    @Column(name="id_person",columnDefinition = "VARCHAR(20)", nullable = false)
    private String idPerson;

    @Column(name="first_name",columnDefinition = "VARCHAR(50)", nullable = false)
    private String firstname;

    @Column(name="last_name",columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastname;

    public Person() {
    }

    @ManyToOne
    City cities;

    // @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    // private List<TypePerson> typepersons;

    @ManyToOne
    TypePerson typePerson;

    public Person(String idPerson, String firstname, String lastname) {
        this.idPerson = idPerson;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}