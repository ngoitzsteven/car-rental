package com.boujeecar.models;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "reservation")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Reservation {
	private int reservationId;
	private String startDate;
	private String endDate;
	private String status;
	private int carId;
	private int customerId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	public int getReservationId() {
		return reservationId;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	@NotBlank
	@Column // defaults to using the Java variable name
	public String getStartDate() {
		return startDate;
	}
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@NotBlank
	@Column // defaults to using the Java variable name
	public String getEndDate() {
		return endDate;
	}
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public String getStatus() {
		return status;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setStatus(String status) {
		this.status = status;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public int getCarId() {
		return carId;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setCarId(int carId) {
		this.carId = carId;
	}
	@NotBlank
	@Column // defaults to using the Java variable name
	public int getCustomerId() {
		return customerId;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "reservaton [reservationId=" + reservationId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", status=" + status + ", carId=" + carId + ", customerId=" + customerId + "]";
	}
	
	
	
	
}