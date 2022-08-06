package com.boujeecar.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "car")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "carId")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private int carId;

//	@NotBlank
	@Column // defaults to using the Java variable name
	private String model;

//	@NotBlank
	@Column
	private String brand;

	@Min(0)
	@Column
	private int mileage;

//	@NotBlank
	@Column
	private String color;
	
	@Min(0)
    @Column
    private int seats;


//	@NotBlank
//	@Column
//	private String type;
	@Column(name = "class")
	@NotBlank
	private String clazz;
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	//	@NotBlank
	@Column(name = "reservation_status")
	private String reservationStatus;

	@OneToMany(mappedBy = "car")
	private List<Reservation> reservations;
	
	
	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	 public int getSeats() {
	        return seats;
	    }

	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}


}
