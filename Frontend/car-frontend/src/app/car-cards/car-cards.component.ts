import { Component, OnInit } from '@angular/core';
import { Car } from 'Car';
import { CarService } from '../services/car.service';
@Component({
  selector: 'app-car-cards',
  templateUrl: './car-cards.component.html',
  styleUrls: ['./car-cards.component.css']
})
export class CarCardsComponent implements OnInit {
carService : CarService;
  cars : Car[] = [];
  constructor(carService : CarService) { 
    this.carService = carService;
  }

  ngOnInit(): void {
    this.carService.findCarList().subscribe((resp) => {
      this.cars=resp;
    })
  }

}
