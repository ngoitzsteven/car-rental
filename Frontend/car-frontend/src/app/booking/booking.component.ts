import { Component, OnInit } from '@angular/core';
import { Car } from 'Car';
import { CarService } from '../services/car.service';
import { ReservationService } from '../services/reservation.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  car: Car = new Car();
  service:ReservationService;
  carService:CarService
  constructor(carService:CarService, service:ReservationService) {
    this.service = service;
    this.carService = carService;
   }

  ngOnInit(): void {
  }

}
