package com.apirestapp.api_rest.domain.entities;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    // @Column(name ="nombre_columna",columnDefinition = "VARCHAR(5)", nullable = false) //Espicifica el nombre de la columna
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String codecountry;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String namecountry;

    @OneToMany
    private List<Region> regions;

    public Country() {
    }

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    
    

}