package com.utn;

public interface IAccion {

	public void correr();
	
	public default void comer() {
		System.out.println("Estoy comiendo");
	}
}
