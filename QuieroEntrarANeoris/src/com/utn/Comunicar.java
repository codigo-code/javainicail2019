package com.utn;

import com.utn.model.IHablar;

public abstract class Comunicar implements IHablar{

	
	private String nombre;
	
	
	public abstract Comunicar creoInstanciaDeMiMismo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void hablar();
	
	public abstract void hablar(String idioma);
	
	
	public String saludo() {
		
		return "hola soy un metodo no abstracto y te saludo";
	}
	
	public String saludo(String idioma) {
		
		// garantiza que va a funcionar
		if("EN".equals(idioma))
			return "hello";
		else
			return "hola";
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		IHablar.super.comer();
	}
}
