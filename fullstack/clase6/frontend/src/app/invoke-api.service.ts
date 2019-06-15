import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class InvokeApiService {

  constructor(private http: HttpClient) { }

  public getListProducto(): any {

    try {
      return this.http.get('api/getList');

    } catch (err) {
      console.error(err);
    }
  }

  public getProductoById(id){

    try {
      return this.http.get('api/producto/'+(id-1));

    } catch (err) {
      console.error(err);
    }
  }
}
