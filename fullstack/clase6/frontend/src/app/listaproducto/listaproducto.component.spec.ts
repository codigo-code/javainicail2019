import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaproductoComponent } from './listaproducto.component';

describe('ListaproductoComponent', () => {
  let component: ListaproductoComponent;
  let fixture: ComponentFixture<ListaproductoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaproductoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaproductoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
