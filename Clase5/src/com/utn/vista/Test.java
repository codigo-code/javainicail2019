package com.utn.vista;

import com.utn.controlador.HornoControlador;
import com.utn.controlador.PizzaControlador;
import com.utn.modelo.Hornable;
import com.utn.modelo.Ingrediente;
import com.utn.modelo.Masa;
import com.utn.modelo.Muzza;
import com.utn.modelo.Pizza;

public class Test {

	public static void main(String[] args) {

		PizzaControlador pc = new PizzaControlador();
		pc.construirPizza();
		
		
		// construyo un objeto de hornoControlador 
		
		Pizza muzza = new Muzza();
		muzza.setMasa(Masa.MEDIOMOLDE);
		muzza.agregoIngredienete(new Ingrediente("Queso", 1));
		HornoControlador hc = new HornoControlador(muzza);
		System.out.println("=============MANEJO DE EVENTOS POR MEDIO DE UNA CLASE ANONIMA! ========");
		hc.muestroCoccccion(
				// genero una instanacia de una interfaz por medio de una clase anonima
				new Hornable() {
			
			@Override
			public void cocccion(Pizza pizza) {
				System.out.println("lo manejo desde un evento! poto!");
				System.out.println(pizza.muestroIngredientes());
				System.out.println("===========FIN!======");
			}
			
		});
	}

}
