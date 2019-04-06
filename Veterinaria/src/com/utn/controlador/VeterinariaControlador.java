package com.utn.controlador;

import com.utn.modelo.Animal;
import com.utn.modelo.Doctor;
import com.utn.modelo.VecDoc;

public class VeterinariaControlador {

	private Doctor[] listaDoctores;
	
	public VeterinariaControlador() {
		this.listaDoctores = new Doctor[5];
		this.listaDoctores[0]= new Doctor(VecDoc.LEOPOLDO);
		this.listaDoctores[1]= new Doctor(VecDoc.ARTURO);
		this.listaDoctores[2]= new Doctor(VecDoc.CLEOTILDE);
		this.listaDoctores[3]= new Doctor(VecDoc.JERBACIO);
		this.listaDoctores[4]= new Doctor(VecDoc.BERTHA);
	}
	
	
	public void atiendoAnimal(Animal animal, int numerDoctor) {
		
		System.out.println("Bienvenido lo atiende doctore: " + this.listaDoctores[numerDoctor].getNombre());
		this.listaDoctores[numerDoctor].atiendoAnimal(animal);
		
	}
	
	
	
}
