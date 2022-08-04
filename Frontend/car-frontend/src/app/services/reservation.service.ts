import { Injectable } from '@angular/core';
import { Reservation } from 'Reservation';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  APIServer = `reservations/`
  constructor(private http: HttpClient) {
    this.http = http;
   }

  createReservation(reservationID:number, start_date:Date, end_date:Date, status:boolean,carID:number,customerID:number){}
  readReservation(reservationID:number){}
  updateReservation(reservationID:number, start_date:Date, end_date:Date, status:boolean,carID:number,customerID:number){}
  deleteReservation(reservationID:number){}

  public findReservationByCustomerId(id :number) :Observable <any> {
    console.log("found");
    return this.http.get(environment.baseURL + this.APIServer +'customer-reservation/' + id)

  }
}
