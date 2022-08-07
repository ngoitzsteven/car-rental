import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from 'Customer';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class CustomerService {
  APIServer = 'customers/';
  constructor(private http: HttpClient) {
    this.http = http;
  }
  findCustomerById(id: number) {
    console.log('customer found');
    return this.http.get(environment.baseURL + this.APIServer + id);
  }
  createCustomer(customer: Customer){
    console.log("customer Created");
    return this.http.post(environment.baseURL + this.APIServer, customer)
  }
}