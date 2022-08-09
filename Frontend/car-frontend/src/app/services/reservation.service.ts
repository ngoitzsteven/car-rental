import { Injectable } from '@angular/core';
import { Reservation } from 'Reservation';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root',
})
export class ReservationService {
  APIServer = `reservations/`;
  constructor(private http: HttpClient) {
    this.http = http;
  }

  createReservation(reservation: Reservation) {
    console.log('Reservation Created');
    return this.http.post(environment.baseURL + this.APIServer, reservation);
  }
  readReservation(reservationID: number) {
    console.log('customer found');
    return this.http.get(environment.baseURL + this.APIServer + reservationID);
  }
  updateReservation(reservation: Reservation) {
    return this.http.post(environment.baseURL + this.APIServer, reservation);
  }

  cancelReservation(reservationId: number) {
    return this.http.post(environment.baseURL + this.APIServer, reservationId);
  }

  public findReservationByCustomerId(id: number): Observable<any> {
    console.log('found');
    return this.http.get(
      environment.baseURL + this.APIServer + 'customer-reservation/' + id
    );
  }
}
