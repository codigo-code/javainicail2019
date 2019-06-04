import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class SigningserviceService {

  constructor(private http: HttpClient) {

  }

  public registroUsuario(user: string, pass: string) {
    try {

      let obj: any = {
        user: user,
        password: pass
      };

      this.http.post('http://localhost:8080/registroUsuario', obj).subscribe(data => {
        // si la respuesta no tiene errores ...  estamos en el lugar correcto
        console.log(data);
      }, erro=>{
        // estamos en atrapando el error que viene desde el api
        console.error(erro);
      });

    } catch (error) {
      console.error(error);
    }
  }
}
