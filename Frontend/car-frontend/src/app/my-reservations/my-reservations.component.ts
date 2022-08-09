import { Component, OnInit } from '@angular/core';
import {CalendarModule} from 'primeng/calendar';
import {Reservation} from 'Reservation';
import { Car } from 'Car';
import { CarService } from '../services/car.service';
import { ReservationService } from '../services/reservation.service';
@Component({
  selector: 'app-my-reservations',
  templateUrl: './my-reservations.component.html',
  styleUrls: ['./my-reservations.component.css']
})
export class MyReservationsComponent implements OnInit {
  reservation : Reservation = new Reservation();
  locations : any[] = []
  cars : Car[] = []
  service : CarService;
  rservice: ReservationService;
  thiscar: Car = new Car();

  constructor(service:CarService, rservice: ReservationService) {
    this.service = service; 
    this.rservice = rservice;
    this.locations = [
      {name: 'New York', code: 'NY'},
      {name: 'Rome', code: 'RM'},
      {name: 'London', code: 'LDN'},
      {name: 'Istanbul', code: 'IST'},
      {name: 'Paris', code: 'PRS'}
  ];

  }

  ngOnInit(): void {
    this.service.findCarList().subscribe((resp) => {
      this.cars=resp;})
  }

  submitReservation(){
        this.reservation.reservationId = Math.floor(Math.random()*1000);
        this.reservation.carId= this.thiscar.carId;
        this.rservice.createReservation(this.reservation);
  }
}