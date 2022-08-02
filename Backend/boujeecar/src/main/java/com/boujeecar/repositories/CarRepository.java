package com.boujeecar.repositories;

import org.springframework.data.repository.CrudRepository;

import com.boujeecar.models.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{

}
