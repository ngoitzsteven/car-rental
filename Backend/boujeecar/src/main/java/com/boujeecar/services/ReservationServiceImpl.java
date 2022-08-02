package com.boujeecar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boujeecar.models.Reservation;
import com.boujeecar.repositories.ReservationRepository;

@Service
@Primary
@Transactional 
public class ReservationServiceImpl implements ReservationServices	{
	
	@Autowired
	private ReservationRepository repository;
	
	@Override
	public Reservation findById(int id) {
		Optional<Reservation> reservation = repository.findById(id);
		return reservation.isPresent() ? reservation.get() : null ;
	}

	@Override
	public Reservation save(Reservation reservation) {
		
		return repository.save(reservation);
	}

	@Override
	public Reservation update(Reservation reservation) {
		
		return repository.save(reservation);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Reservation> findAll() {
		List<Reservation> reservation = new ArrayList<>();
		repository.findAll().forEach(reservation::add);
		return reservation;
	}

}
