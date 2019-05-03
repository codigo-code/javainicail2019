package com.utn.model;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void encender() {
		System.out.println("prum prum!");
	}
}
