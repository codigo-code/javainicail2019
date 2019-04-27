package com.utn.controlador;

import com.utn.modelo.Fugazza;
import com.utn.modelo.Hornable;
import com.utn.modelo.HornoLena;
import com.utn.modelo.Ingrediente;
import com.utn.modelo.Masa;
import com.utn.modelo.Muzza;
import com.utn.modelo.Pizza;
import com.utn.modelo.Vegetariana;

public class PizzaControlador {

	public void construirPizza() {

		
		//factoria para la interfaz
		
		Hornable hlena = new HornoLena();
		
		// construimos una pizza por medio de una clase abstracta
		// esto se llama factoria abstracta

		// clase abstract + variable = new Clase donde extiende ej.

		Pizza p1 = new Muzza();
		p1.setMasa(Masa.MOLDE);
		p1.agregoIngredienete(new Ingrediente("Queso Cremoso", 2.0));
		p1.agregoIngredienete(new Ingrediente("Aceitunas",8));
		

		Pizza p2 = new Fugazza();
		p2.setMasa(Masa.PIEDRA);
		p2.agregoIngredienete(new Ingrediente("Cebolla", 2));
		p2.agregoIngredienete(new Ingrediente("queso muzareloso",1.5));
		
		
		Pizza p3 = new Vegetariana();
		p3.setMasa(Masa.MEDIOMOLDE);
		p3.agregoIngredienete(new Ingrediente("Choclo", 1));
		p3.agregoIngredienete(new Ingrediente("palmito", 3));
		p3.agregoIngredienete(new Ingrediente("Dulce de leche", 4));
		p3.agregoIngredienete(new Ingrediente("Mermelada de higo", 2));
		
		System.out.println("=========== MUESTRO INGREDIENTES=====================");
		System.out.println("La clase es: " + p1.getClass().getSimpleName() + " "+ p1.muestroIngredientes());;
		System.out.println("La clase es: " + p2.getClass().getSimpleName() + " "+ p2.muestroIngredientes());;
		System.out.println("La clase es: " + p3.getClass().getSimpleName() + " "+ p3.muestroIngredientes());;
		
		System.out.println("===================PREPARACION=====");
		p1.preparacion();
		p2.preparacion();
		p3.preparacion();
		
		
		System.out.println("=========TRABAJO CON LA INTERFAZ=================");
		
		hlena.cocccion(p3);
		
	}
}
