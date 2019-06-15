import { Component, OnInit, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {


  @Output() verVehiculo= new EventEmitter<any>();
  
  
  public vehiculo: String;

  constructor() { }

  ngOnInit() {
  }

  buscar(){
    this.verVehiculo.emit(this.vehiculo);
  }

}
