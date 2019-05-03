package com.utn.view;

import com.utn.controller.PilotoControlador;
import com.utn.controller.VehiculoControlador;
import com.utn.exception.CheckException;

public class Test {

	public static void main(String[] args) {

		VehiculoControlador vc = new VehiculoControlador();
		
		try {
			vc.creoVehiculo();
		} catch (CheckException e) {
			e.guardoErrorEnArchivo();
			System.out.println("salio por excepcion!");
		}
		
		System.out.println("Trabajamos con una exception no controlada UNCHECKED!");
		
		PilotoControlador pc = new PilotoControlador();
		
		pc.creoPiloto();
		
		
		System.out.println("Fin del programa!");
		
	}

}
