package com.boujeecar.services;

import java.util.List;

import com.boujeecar.models.Car;

public interface CarService {
	Car findById(int id);
	Car save(Car car);
	Car update (Car car);
	void deleteById(int id);
	List<Car> findAll();

	
}
