package com.boujeecar.services;

import com.boujeecar.models.Customer;

public interface CustomerServices{
	Customer findById(int id);
	Customer save(Customer customer);
	Customer update (Customer customer);
	void deleteById(int id);
}
