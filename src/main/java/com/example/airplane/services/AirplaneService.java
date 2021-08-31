package com.example.airplane.services;

import com.example.airplane.models.Airplane;
import com.example.airplane.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneService {

    @Autowired
    AirplaneRepository airplaneRepository;

    public Iterable<Airplane> getAirplanes() {
        return this.airplaneRepository.findAll();
    }

    public void createAirplane(Airplane airplane) {
        this.airplaneRepository.save(airplane);
    }

    public void deleteAirplane(int id) {
        this.airplaneRepository.deleteById(id);
    }

    public Optional<Airplane> getAirplaneById(int id) {
        return this.airplaneRepository.findById(id);

    }

    public Airplane updateAirplane(Airplane airplane) {

        Iterable<Airplane> airplanes = this.airplaneRepository.findAll();
        for (Airplane airplane1:airplanes) {
            if(airplane.getId() == airplane1.getId()){
                airplane1.setAirplaneIdPlate(airplane.getAirplaneIdPlate());
                airplane1.setCurrentAirport(airplane.getCurrentAirport());
                airplane1.setAmountOfFuel(airplane.getAmountOfFuel());
            }
        }

        return this.airplaneRepository.save(airplane);
    }

}
