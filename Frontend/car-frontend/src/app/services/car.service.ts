import { Injectable } from '@angular/core';
import {Car } from 'Car';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})


export class CarService {

  APIServer = 'cars/'

  constructor(private http: HttpClient) { 
    this.http = http;
  }

  public findCarList(): Observable<any> {
    return this.http.get(environment.baseURL + this.APIServer);
  }
}
