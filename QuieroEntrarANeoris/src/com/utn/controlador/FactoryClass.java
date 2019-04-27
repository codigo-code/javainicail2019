package com.utn.controlador;

import com.utn.Comunicar;

public class FactoryClass {

	private Comunicar comunicar;
	
	// factoria abstracta
	public FactoryClass(Comunicar comunicar)	 {
		System.out.println(this.comunicar);
		this.comunicar= comunicar;
	}
	
	public void muestroPersona() {
		System.out.println(this.comunicar);
		System.out.println(this.comunicar.getNombre());
	}
}
