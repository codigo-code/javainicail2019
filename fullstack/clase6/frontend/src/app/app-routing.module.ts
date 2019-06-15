import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductoComponent } from './producto/producto.component';
import { ListaproductoComponent } from './listaproducto/listaproducto.component';
import { FormularioComponent } from './formulario/formulario.component';

const routes: Routes = [
  {
  path: 'producto', component: ProductoComponent
},
{ 
  path: 'listaProducto', component: ListaproductoComponent 
},
{
  path: 'formulario', component: FormularioComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
