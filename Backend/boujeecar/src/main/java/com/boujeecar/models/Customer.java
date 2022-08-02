package com.boujeecar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "customer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Customer {
	private int customerId;
	private String customerName;
	private String location;
	private int reservationId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
	public int getCustomerId() {
		return customerId;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public String getCustomerName() {
		return customerName;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public String getLocation() {
		return location;
	}
	
	@NotBlank
	@Column // defaults to using the Java variable name
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", location=" + location
				+ ", reservationId=" + reservationId + "]";
	}
	
	
	
}
