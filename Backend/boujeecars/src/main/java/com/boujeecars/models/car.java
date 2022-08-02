package com.boujeecars.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

// car class does not work with naming conventions in java. changed to type for clarification 

@Entity
@Table(name = "car")
public class car {
	private int carId;
	private String model;
	private String brand;
	private int mileage;
	private String color;
	private String type;
	private String reservationStatus;
	
	
	
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



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getReservationStatus() {
		return reservationStatus;
		
	}



	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}



	@Override
	public String toString() {
		return "car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", mileage=" + mileage + ", color="
				+ color + ", type=" + type + ", reservationStatus=" + reservationStatus + "]";
	}
}
