package com.utn.modelo;

public class Auto extends Vehiculo{

	private boolean cupe;
	
	public Auto(String marca, String modelo, String color, boolean cupe) {
		super(marca, modelo, color);
		this.cupe=cupe;
		// TODO Auto-generated constructor stub
	}

	public boolean isCupe() {
		return cupe;
	}

	public void setCupe(boolean cupe) {
		this.cupe = cupe;
	}

	@Override
	public String toString() {
		return  super.toString() + " Auto [cupe=" + cupe + "]";
	}
	
	

}
