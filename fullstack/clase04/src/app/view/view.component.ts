import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {


  

  public nombre: String;
  public descripcion: String;
  public imagen: String;

  public listAuto: any;

  constructor() {

    this.listAuto = [
    {
      id: 1,
      nombre:'renault 4',
      descripcion: 'joya nunca taxi',
      imagen: 'assets/img/renault4.jpg'

    },
    {
      id: 2,
      nombre:'fiat 125',
      descripcion: 'rual ',
      imagen: 'assets/img/fiatrual.jpg'
    }, 
    {
      id: 3,
      nombre:'Citroen C3',
      descripcion: 'huevo de pascua ',
      imagen: 'assets/img/finalrual.jpg'
    }]
  }

  ngOnInit() {
    this.nombre = 'renaul 4';
    this.descripcion = 'joya nunca taxi';
    this.imagen = 'assets/img/renault4.jpg';
    //console.log(this.vehiculo);

  }

  verVehiculo(datos: any){
    console.log(datos);
  }
}
