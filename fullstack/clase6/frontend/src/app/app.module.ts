import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaproductoComponent } from './listaproducto/listaproducto.component';
import { ProductoComponent } from './producto/producto.component';
import { FormularioComponent } from './formulario/formulario.component';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { InvokeApiService } from './invoke-api.service';

@NgModule({
  declarations: [
    AppComponent,
    ListaproductoComponent,
    ProductoComponent,
    FormularioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [InvokeApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
