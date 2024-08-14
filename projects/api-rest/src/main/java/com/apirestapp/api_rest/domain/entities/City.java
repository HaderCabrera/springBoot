package com.apirestapp.api_rest.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
// @Table(name = "ciudades")
public class City {
    @Id
    // @Column(name ="nombre_columna",columnDefinition = "VARCHAR(5)", nullable = false) //Espicifica el nombre de la columna
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String codecity;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String namecity;

    @ManyToOne
    private Region regions;
    public City() {
    }

    public String getCodecity() {
        return codecity;
    }

    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public Region getRegions() {
        return regions;
    }

    public void setRegions(Region regions) {
        this.regions = regions;
    }

    
}
