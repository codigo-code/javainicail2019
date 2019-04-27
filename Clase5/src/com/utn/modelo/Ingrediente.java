package com.utn.modelo;

public class Ingrediente {

	private String nombre;
	private double cantidad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Ingrediente() {
		// TODO Auto-generated constructor stub
	}
	public Ingrediente(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
}
