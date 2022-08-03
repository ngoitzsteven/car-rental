package com.boujeecar.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "customer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "customerId")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_Id")
	private int customerId;
	
	@Column(name = "customer_name") // defaults to using the Java variable name
	private String customerName;
	
	@OneToMany(mappedBy = "customer")
	private List<Reservation> reservations;
	
 	@Column
	private String location;
	

	

	public int getCustomerId() {
		return customerId;
	}
	

	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	

	@Column // defaults to using the Java variable name
	public String getCustomerName() {
		return customerName;
	}
	

	@Column // defaults to using the Java variable name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

	@Column // defaults to using the Java variable name
	public String getLocation() {
		return location;
	}
	

	@Column // defaults to using the Java variable name
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", location=" + location
				+ "]";
	}
	
	
	
}
