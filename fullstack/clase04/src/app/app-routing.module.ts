import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SigninComponent } from './signin/signin.component';
import { FindCarComponent } from './find-car/find-car.component';

const routes: Routes = [
  { path: 'signin', component: SigninComponent },
  { path: 'findCar', component: FindCarComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
