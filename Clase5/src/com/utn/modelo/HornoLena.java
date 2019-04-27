package com.utn.modelo;

public class HornoLena implements Hornable{

	@Override
	public void cocccion(Pizza pizza) {

		System.out.println("Muestro los valor de la clase " + pizza.getClass().getSimpleName());
			pizza.preparacion();
		
	}

}
