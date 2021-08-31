package com.example.airplane.controllers;

import com.example.airplane.models.Airplane;
import com.example.airplane.models.Airport;
import com.example.airplane.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/airports")
public class AirportController {

    @Autowired
    AirportRepository airportRepository;

    @GetMapping("/all")
    public Iterable<Airport> getAirports(){
        return this.airportRepository.findAll();
    }

    @GetMapping("/airport/{id}")
    public Optional<Airport> getById(@PathVariable int id) {
        return this.airportRepository.findById(id);
    }

    @PostMapping("/new")
    public Airport createAirport(@RequestBody Airport airport){
        this.airportRepository.save(airport);
        return airport;
    }

    @DeleteMapping("delete/{id}")
    public void deleteAirport(@PathVariable int id){
        this.airportRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void updateAirport(@RequestBody Airport airport){ this.airportRepository.save(airport);
    }

}
