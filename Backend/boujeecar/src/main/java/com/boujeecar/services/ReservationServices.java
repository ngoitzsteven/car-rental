package com.boujeecar.services;

import java.util.List;

import com.boujeecar.models.Reservation;

public interface ReservationServices {
	Reservation findById(int id);
	Reservation save(Reservation reservation);
	Reservation update (Reservation reservation);
	void deleteById(int id);
	List<Reservation> findAll();
}
