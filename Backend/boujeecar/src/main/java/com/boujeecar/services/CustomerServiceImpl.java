package com.boujeecar.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boujeecar.models.Customer;
import com.boujeecar.repositories.CustomerRepository;

@Service
@Primary
@Transactional
public class CustomerServiceImpl implements CustomerServices {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer findById(int id) {
		Optional<Customer> customer = repository.findById(id);
		return customer.isPresent() ? customer.get() : null;
	}

	@Override
	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);

	}

}
