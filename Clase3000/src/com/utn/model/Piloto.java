package com.utn.model;

public class Piloto {

	private String nombre;
	private String licencia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	public void manejarEstado() {
		System.out.println("esta del tomate!");
	}
}
