import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SigninComponent } from './signin/signin.component';
import { NewProductComponent } from './new-product/new-product.component';
import { SigningserviceService } from './signingservice.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule }   from '@angular/forms';
import { FindCarComponent } from './find-car/find-car.component';
import { SearchComponent } from './search/search.component';
import { ViewComponent } from './view/view.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SigninComponent,
    NewProductComponent,
    FindCarComponent,
    SearchComponent,
    ViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [SigningserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
