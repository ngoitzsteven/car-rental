package com.boujeecar.repositories;

import org.springframework.data.repository.CrudRepository;

import com.boujeecar.models.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer>{

}
