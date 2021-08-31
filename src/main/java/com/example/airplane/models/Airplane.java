package com.example.airplane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    private String airplaneIdPlate;
    private String currentAirport;
    private int amountOfFuel;

    public Airplane(int id, String type, String airplaneIdPlate, String currentAirport, int amountOfFuel) {
        this.id = id;
        this.type = type;
        this.airplaneIdPlate = airplaneIdPlate;
        this.currentAirport = currentAirport;
        this.amountOfFuel = amountOfFuel;
    }

    public Airplane() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirplaneIdPlate() {
        return airplaneIdPlate;
    }

    public void setAirplaneIdPlate(String airplaneIdPlate) {
        this.airplaneIdPlate = airplaneIdPlate;
    }

    public String getCurrentAirport() {
        return currentAirport;
    }

    public void setCurrentAirport(String currentAirport) {
        this.currentAirport = currentAirport;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }
}
