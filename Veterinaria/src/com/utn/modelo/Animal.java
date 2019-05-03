package com.utn.modelo;

public class Animal {

	private TipoAnimal animal;
	private String nombre;
	private String raza;
	private int edad;
	private String causa;

	public Animal(TipoAnimal animal) {
		this.animal = animal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public TipoAnimal getAnimal() {
		return animal;
	}

	@Override
	public String toString() {
		return "Animal [animal=" + animal + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", causa="
				+ causa + "]";
	}
	
	

}
