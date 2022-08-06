import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Car } from 'Car';
import { CarService } from '../services/car.service';
import { ReservationService } from '../services/reservation.service';
@Component({
  selector: 'app-car-cards',
  templateUrl: './car-cards.component.html',
  styleUrls: ['./car-cards.component.css']
})
export class CarCardsComponent implements OnInit {
carService : CarService;
resService: ReservationService
cars : Car[] = [];
  constructor(carService : CarService, resService: ReservationService, private router :Router) { 
    this.carService = carService;
    this.resService=resService;
  }

  ngOnInit(): void {
    this.carService.findCarList().subscribe((resp) => {
      this.cars=resp;
    })
  }

  book(){
    this.router.navigate(['/booking']);

  }
}
