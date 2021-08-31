package com.example.airplane.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String location;

    @OneToMany()
    private List<Airplane> currentAirplanes;

    public Airport(int id, String name, String location, List<Airplane> currentAirplanes) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.currentAirplanes = currentAirplanes;
    }

    public Airport() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Airplane> getCurrentAirplanes() {
        return currentAirplanes;
    }

    public void setCurrentAirplanes(List<Airplane> currentAirplanes) {
        this.currentAirplanes = currentAirplanes;
    }
}
