package com.utn.controlador;

public class SingletoController {

	
	private String nombre;
	
	
	
	// se genera una sola instancia del objeto que esten creando
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static SingletoController creoObjeto=null;
	
	
	public static SingletoController newInstance() {
		
		if(creoObjeto == null) {
			creoObjeto= new SingletoController();
		}
		
		return creoObjeto;
	}
	
	//  traer el constructor y hacerlo privado
	private SingletoController() {}
	
	
	
	//Patron sigleton
}
