package com.utn.model;

import com.utn.Comunicar;

public class PabloClass extends Comunicar {

	private String apellido;
	
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/***
	 * SOBRECARGA
	 */
	@Override
	public void hablar() {

		System.out.println("hola soy pablo");
	}

	@Override
	public void hablar(String idioma) {
		if ("TUMBA".equals(idioma)) {
			System.out.println("eeehh ' jakie el vanlko! gato'");
		}
	}

	@Override
	public void correr(double km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comunicar creoInstanciaDeMiMismo() {
		// TODO Auto-generated method stub
		return this;
	}
	
	

}
