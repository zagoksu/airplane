package com.example.airplane.controllers;

import com.example.airplane.models.Airplane;
import com.example.airplane.repositories.AirplaneRepository;
import com.example.airplane.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AirplaneController {

    Airplane willUpdateAirplane;

    @Autowired
    AirplaneService airplaneService;

    @Autowired
    AirplaneRepository airplaneRepository;

    @GetMapping("/airplanes")
    public Iterable<Airplane> getAirplanes(){
        return this.airplaneService.getAirplanes();
    }

    @GetMapping("/airplane/{id}")
    public Optional<Airplane> getById(@PathVariable int id) {
        return this.airplaneService.getAirplaneById(id);
    }

    @GetMapping("airplanebytype")
    public Optional<Airplane> getAirplaneByType(@RequestParam String type){
        return this.airplaneRepository.findByTypeIgnoreCase(type);
    }

    @GetMapping("/airplanelocation/{currentAirport}")
    public Iterable<Airplane> getAirplanesByLocation(@PathVariable String currentAirport){

        Iterable<Airplane> airplanes = this.airplaneRepository.findAllByCurrentAirportIgnoreCase(currentAirport);
        return airplanes;

    }

    @PostMapping("/newairplane")
    public Airplane createAirplane(@RequestBody Airplane airplane){
        this.airplaneService.createAirplane(airplane);
        return airplane;
    }

    @DeleteMapping("deleteairplane/{id}")
    public void deleteAirplane(@PathVariable int id){
        this.airplaneService.deleteAirplane(id);
    }

    @PutMapping("/updateairplane")
    public void updateAirplane(@RequestBody Airplane airplane){
        this.airplaneService.updateAirplane(airplane);
    }


}
