package com.boujeecar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boujeecar.models.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{
	
	@Query("select r from Reservation r where r.customer.customerId = ?1")
	public List<Reservation> findByCustomerId(int id);
}
