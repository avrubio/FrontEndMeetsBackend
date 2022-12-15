package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dj {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String originCountry;

    public Dj(){

    }
    public Dj(String name, String orginCountry) {
        this.name = name;
        this.originCountry = orginCountry;
    }

    public Dj(Integer id, String name, String orginCountry) {
        this.id = id;
        this.name = name;
        this.originCountry = orginCountry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOrginCountry(String orginCountry) {
        this.originCountry = orginCountry;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
