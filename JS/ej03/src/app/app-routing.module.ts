import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { callLifecycleHooksChildrenFirst } from '@angular/core/src/view/provider';
import { FormularioComponent } from './formulario/formulario.component';

const routes: Routes = [
  {
    path: 'formulario',
    pathMatch: 'full',
    component: FormularioComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
