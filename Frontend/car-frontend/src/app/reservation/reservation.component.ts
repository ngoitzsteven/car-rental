import { Component, OnInit } from '@angular/core';
import { Reservation } from "Reservation";
import { ReservationService } from '../services/reservation.service';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent implements OnInit {
  reservations : Reservation[] = [];
  ReservationAPIService: ReservationService
  constructor(ReservationAPIService: ReservationService) {
    this.ReservationAPIService = ReservationAPIService;
   }

  ngOnInit(): void {
    this.ReservationAPIService.findReservationByCustomerId(1).subscribe((resp) => {
      this.reservations = resp;
    });
  }    
    findReservationByProductId(id : number)  {
     this.ReservationAPIService.findReservationByCustomerId(id).subscribe;
    }
  }


