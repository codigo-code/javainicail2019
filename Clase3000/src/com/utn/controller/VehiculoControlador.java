package com.utn.controller;

import com.utn.exception.CheckException;
import com.utn.model.Vehiculo;

public class VehiculoControlador {

	
	public void creoVehiculo() throws CheckException {

			Vehiculo a = null;
			if(a == null) {
				throw new CheckException("La variable vehiculo no esta incializada");
			}
			a.encender();
	}
}
