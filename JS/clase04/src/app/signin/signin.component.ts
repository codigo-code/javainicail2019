import { Component, OnInit } from '@angular/core';
import { NgLocaleLocalization } from '@angular/common';
import { SigningserviceService } from '../signingservice.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  public user: string;
  public password: string;
  public repassword: string;
  public mensajeError: string ='';
  constructor(private siginService: SigningserviceService) { }

  ngOnInit() {
  }

  validar(): void{

    if(this.password===this.repassword){
      // redireccionando
      this.siginService.registroUsuario(this.user,this.password);

      console.log('esta ok');
       this.mensajeError='Se registrara el usuario!';

    }else{
      this.mensajeError='La contraseña no coincide!';
    }

  }

}
