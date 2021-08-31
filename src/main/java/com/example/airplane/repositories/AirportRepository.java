package com.example.airplane.repositories;

import com.example.airplane.models.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Integer> {
}
