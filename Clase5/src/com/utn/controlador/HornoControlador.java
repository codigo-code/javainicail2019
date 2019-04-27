package com.utn.controlador;

import com.utn.modelo.Hornable;
import com.utn.modelo.Pizza;

public class HornoControlador {

	private Pizza pizza;
	
	public HornoControlador(Pizza p) {
		this.pizza=p;
	}
	
	public void muestroCoccccion(Hornable hornito) {
		System.out.println("INICIO DE LA EJECUCION del evento");
		hornito.cocccion(pizza);
		System.out.println("FIN DE LA EJECUCION DEL EVENTO");
	}
}
