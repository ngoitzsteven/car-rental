package com.boujeecars.models;

public class reservaton {
	private int reservationId;
	private String startDate;
	private String endDate;
	private String status;
	private int carId;
	private int customerId;
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "reservaton [reservationId=" + reservationId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", status=" + status + ", carId=" + carId + ", customerId=" + customerId + "]";
	}
	
	
	
	
}
