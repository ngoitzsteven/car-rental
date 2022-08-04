import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarCardsComponent } from './car-cards/car-cards.component';
import { MyReservationsComponent } from './my-reservations/my-reservations.component';
import { ReservationComponent } from './reservation/reservation.component';

const routes: Routes = [
  {path: 'my-reservations', component: MyReservationsComponent},
  {path: 'car-cards', component: CarCardsComponent},
  {path: 'reservation', component: ReservationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
