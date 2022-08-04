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

import com.boujeecar.models.Reservation;
import com.boujeecar.services.ReservationServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationServices service;

	@GetMapping("/{id}")
	public Reservation findById(@PathVariable int id) {
		return service.findById(id);
	}
	

	@GetMapping("customer-reservation/{customer_id}")
	public List<Reservation> findByCustomerId(@PathVariable(name = "customer_id") int id) {
		return service.findByCustomerId(id);	
	}
	
	

	// create
	@PostMapping
	public ResponseEntity<Reservation> create(@Valid @RequestBody Reservation reservation) {
		return new ResponseEntity<>(service.save(reservation), HttpStatus.CREATED);
	}
	
	// update
	@PutMapping("/{id}")
	public Reservation update(@Valid @RequestBody Reservation reservation, @PathVariable int id) {
		reservation.setReservationId(id);
		return service.update(reservation);
	}
	
	// delete by id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
}
}
