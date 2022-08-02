package com.boujeecar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boujeecar.models.Car;
import com.boujeecar.repositories.CarRepository;


@Service
@Primary
@Transactional
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository repository;

	@Override
	public Car findById(int id) {
		Optional<Car> car = repository.findById(id);
		return car.isPresent() ? car.get() : null;
	}

	@Override
	public Car save(Car car) {
		return repository.save(car);
	}

	@Override
	public Car update(Car car) {
		return repository.save(car);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Car> findAll() {
	    List<Car> car = new ArrayList<>();
	    repository.findAll().forEach(car::add);
		return car;
	}

}
