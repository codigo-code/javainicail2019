package com.utn.modelo;

public class Moto extends Vehiculo {

	private String tipo;

	public Moto(String marca, String modelo, String color, String tipo) {
		super(marca, modelo, color);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Moto [tipo=" + tipo + "]";
	}

}
