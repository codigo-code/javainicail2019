package com.utn.model;

import com.utn.IAccion;

public interface IHablar extends IAccion {
	@Override
	default void correr() {
		System.out.println("Estoy corriendo");
	}

	public void correr(double km);
}
