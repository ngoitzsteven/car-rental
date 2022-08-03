package com.boujeecar.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityReference;


@Entity
@Table(name = "reservation")

public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private int reservationId;
	@NotBlank
	@Column(name = "start_date") // defaults to using the Java variable name
	private Date startDate;
	@NotBlank
	@Column	(name = "end_date") // defaults to using the Java variable name
	private Date endDate;
	@NotBlank
	@Column // defaults to using the Java variable name
	private String status;
	
	@JsonIdentityReference(alwaysAsId = true)
	@NotBlank
	@ManyToOne
	@JoinColumn (name = "car_id")// defaults to using the Java variable name
	private Car car;
	
	@JsonIdentityReference(alwaysAsId = true)
	@NotBlank
	@ManyToOne
	@JoinColumn (name = "customer_id")// defaults to using the Java variable name
	private Customer customer;
	
	
	public int getReservationId() {
		return reservationId;
	}
	
	
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getStatus() {
		return status;
	}
	

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", status=" + status + ", car=" + car + ", customer=" + customer + "]";
	}


	
	
	
	
}