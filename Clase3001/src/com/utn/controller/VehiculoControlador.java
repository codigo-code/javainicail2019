package com.utn.controller;

import java.util.ArrayList;

import com.utn.modelo.Auto;
import com.utn.modelo.Vehiculo;
import com.utn.modelo.enums.TipoVehiculo;
import com.utn.modelo.exceptions.VehiculoExecption;

public class VehiculoControlador {

	private ArrayList<Vehiculo> listaVehiculo;

	public VehiculoControlador() {
		this.listaVehiculo=new ArrayList<Vehiculo>();
	}

	public Vehiculo creoVehiculo(TipoVehiculo tipo)throws VehiculoExecption {
		switch (tipo) {
		case AUTO:

			return new Auto("Ferrai", "F50", "Rojo", true);
		case MOTO:
			throw new VehiculoExecption("No se puede crear la moto, porque no se genero la instancia");
//			return new Moto("Ducatti", "Paniolli", "negra", "Deportiva");

		default:
			System.out.println("no conozco el  objeto");
			return null;
		}
	}

	public ArrayList<Vehiculo> getListaVehiculo() {
		return listaVehiculo;
	}

	public void agregoVehiculo(Vehiculo vehiculo) {
		this.listaVehiculo.add(vehiculo);
	}


	
	public void muestroVehiculosCargados() {
		
		this.listaVehiculo.forEach(item->{
			System.out.println(item);
		});
	}


	
	
	
}
