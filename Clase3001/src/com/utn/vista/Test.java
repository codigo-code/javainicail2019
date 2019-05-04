package com.utn.vista;

import com.utn.controller.VehiculoControlador;
import com.utn.modelo.Vehiculo;
import com.utn.modelo.enums.TipoVehiculo;

public class Test {


	public static void main(String[] args) {

		VehiculoControlador  vc = new VehiculoControlador();
		
		vc.agregoVehiculo(vc.creoVehiculo(TipoVehiculo.AUTO));
		vc.agregoVehiculo(vc.creoVehiculo(TipoVehiculo.MOTO));
		vc.agregoVehiculo(vc.creoVehiculo(TipoVehiculo.AUTO));
		vc.agregoVehiculo(vc.creoVehiculo(TipoVehiculo.AUTO));
		
		vc.muestroVehiculosCargados();
		
	}

}
