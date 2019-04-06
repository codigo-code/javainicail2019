package com.utn.modelo;

public class Doctor {

	private VecDoc nombre;
	private Animal[] listaAnimal;
	private int cont =0;
	
	public Doctor(VecDoc nombre) {
		this.listaAnimal = new Animal[5];
		this.nombre=nombre;
	}

	public VecDoc getNombre() {
		return nombre;
	}

	public void setNombre(VecDoc nombre) {
		this.nombre = nombre;
	}

	public Animal[] getListaAnimal() {
		return listaAnimal;
	}
	
	
	public void atiendoAnimal(Animal animal) {
		if(cont < 5) {
			this.listaAnimal[cont]= animal;
			
			System.out.println(anializoCausa(this.listaAnimal[cont].getCausa()));
			cont++;
			
		}else {
			System.out.println(this.nombre + " llego al maximo de atencion diaria");
			System.out.println("no se pueden antender mas animales jodase!");
		}
	}
	
	private String anializoCausa(String causa) {
		
		
		if("atropello" == causa) {
			return " inyeccion letal";
		}else if("panza"== causa) {
			return "muerte segura";
		}else {
			return "tirelo a un pozo";
		}
	}
	
	
}





