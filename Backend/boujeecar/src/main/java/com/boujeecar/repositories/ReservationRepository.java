package com.boujeecar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boujeecar.models.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{

}
