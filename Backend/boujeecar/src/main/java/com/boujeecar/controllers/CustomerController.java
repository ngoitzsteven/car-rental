package com.boujeecar.controllers;

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

import com.boujeecar.models.Customer;
import com.boujeecar.services.CustomerServices;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerServices service;
	

	@GetMapping("/{id}")
	public Customer findById(@PathVariable int id) {
		return service.findById(id);
	}
	// create
	
	@PostMapping
	public ResponseEntity<Customer> create(@Valid @RequestBody Customer customer) {
		return new ResponseEntity<>(service.save(customer), HttpStatus.CREATED);
	}
	
	// update
	
	@PutMapping("/{id}")
	public Customer update(@Valid @RequestBody Customer customer, @PathVariable int id) {
		customer.setCustomerId(id);
		return service.update(customer);
	}
	
	// delete by id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
}
}
