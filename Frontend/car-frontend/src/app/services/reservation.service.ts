import { Injectable } from '@angular/core';
import { Reservation } from 'Reservation';
@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  
  constructor() { }

  createReservation(reservationID:number, start_date:Date, end_date:Date, status:boolean,carID:number,customerID:number){}
  readReservation(reservationID:number){}
  updateReservation(reservationID:number, start_date:Date, end_date:Date, status:boolean,carID:number,customerID:number){}
  deleteReservation(reservationID:number){}

}
