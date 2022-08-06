import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { PrimeNGConfig } from 'primeng/api';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { ReservationComponent } from './reservation/reservation.component';
import { CarCardsComponent } from './car-cards/car-cards.component';
import {CardModule} from 'primeng/card';
import {CascadeSelectModule} from 'primeng/cascadeselect';
import { ButtonModule } from 'primeng/button';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { MyReservationsComponent } from './my-reservations/my-reservations.component';
import { CustomerProfileComponent } from './customer-profile/customer-profile.component';
import {FormsModule} from '@angular/forms';
import {TableModule} from 'primeng/table';
import { ConfirmationService, MessageService } from 'primeng/api';
import {PaginatorModule} from 'primeng/paginator';
import { BookingComponent } from './booking/booking.component';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ReservationComponent,
    CarCardsComponent,
    MyReservationsComponent,
    CustomerProfileComponent,
    BookingComponent,
    

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CardModule,
    ButtonModule,
    BrowserAnimationsModule,
    CascadeSelectModule,
    HttpClientModule,
    FormsModule,
    TableModule,
    PaginatorModule
    
  ],
  providers: [ConfirmationService, MessageService, PrimeNGConfig],
  bootstrap: [AppComponent]
})
export class AppModule { }
