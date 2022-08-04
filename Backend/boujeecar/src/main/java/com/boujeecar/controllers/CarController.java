package com.boujeecar.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boujeecar.models.Car;
import com.boujeecar.services.CarService;


@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/cars")
public class CarController {
	@Autowired
	private CarService service;
	
	@GetMapping
	public List<Car> findAll(){
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Car findById(@PathVariable int id) {
		return service.findById(id);
	}
	// create
	@PostMapping
	public ResponseEntity<Car> create(@Valid @RequestBody Car car) {
		return new ResponseEntity<>(service.save(car), HttpStatus.CREATED);
	}
	
	// update
	@PutMapping("/{id}")
	public Car update(@Valid @RequestBody Car car, @PathVariable int id) {
		car.setCarId(id);
		return service.update(car);
	}
	
	// delete by id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
}
}

