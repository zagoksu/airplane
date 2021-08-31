package com.example.airplane.repositories;

import com.example.airplane.models.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.Optional;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane,Integer> {

    Optional<Airplane> findByTypeIgnoreCase(String type);

    Iterable<Airplane> findAllByCurrentAirportIgnoreCase(String currentAirport);
}
