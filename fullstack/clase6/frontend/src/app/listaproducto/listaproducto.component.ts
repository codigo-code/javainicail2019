import { Component, OnInit } from '@angular/core';
import { InvokeApiService } from '../invoke-api.service';

@Component({
  selector: 'app-listaproducto',
  templateUrl: './listaproducto.component.html',
  styleUrls: ['./listaproducto.component.css']
})
export class ListaproductoComponent implements OnInit {

  public listProductos: any;
  public item:any;

  constructor(private service: InvokeApiService) { }


  ngOnInit() {

    this.service.getListProducto().subscribe(data => {
      this.listProductos = data;

    }, err => {
      console.log(err);
    });

  }


  verProducto(itemSeleccionado){


    this.service.getProductoById(itemSeleccionado).subscribe(data=>{
      
      this.item=data;
    },err=>{
      console.log(err);
    })
  }

}
