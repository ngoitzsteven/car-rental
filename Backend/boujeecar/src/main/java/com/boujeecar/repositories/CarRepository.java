package com.boujeecar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boujeecar.models.Car;
@Repository
public interface CarRepository extends CrudRepository<Car, Integer>{

}
