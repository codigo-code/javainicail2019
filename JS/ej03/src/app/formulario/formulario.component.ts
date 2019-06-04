import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.scss']
})
export class FormularioComponent implements OnInit {

  public nombre: String;


  constructor() {

  }

  ngOnInit() {
  }

  escribo() {
    alert(this.nombre);
  }


}
