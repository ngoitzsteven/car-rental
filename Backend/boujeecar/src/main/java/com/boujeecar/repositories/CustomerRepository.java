package com.boujeecar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boujeecar.models.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	
}
