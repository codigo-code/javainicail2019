package com.utn.modelo;

import java.util.ArrayList;

public abstract class Pizza {

	private Masa masa;
	
	private ArrayList<Ingrediente> ingredientes; // 

	public Masa getMasa() {
		return masa;
	}

	public void setMasa(Masa masa) {
		this.masa = masa;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	// modificamos el set de la lista para pasar un elemento a la lista
	public void agregoIngredienete(Ingrediente ingredientes) {
		this.ingredientes.add(ingredientes);
	}
	
	public Pizza() {
		//inicializamos a lista 
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public Pizza(Masa masa, ArrayList<Ingrediente> ingredientes) {
		// inicializamos la lista
		this.ingredientes= new ArrayList<Ingrediente>();
		this.masa = masa;
		this.ingredientes = ingredientes;
	}
	
	
	// al ser abstracto se va a desarrollar en la clase que se extienda 
	public abstract void preparacion();
	
	public String muestroIngredientes() {
		
		StringBuilder mostrar =new StringBuilder();
		
		for (Ingrediente item : ingredientes) {
			mostrar.append(item.getNombre()+ ",");
		}
		
		return "El tipo de masa es " + this.masa + " con los ingredientes " + mostrar;
	}
}
