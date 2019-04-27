package com.utn.modelo;

public class Muzza extends Pizza {

	@Override
	public void preparacion() {
		System.out.println("el horno esta en 420 grados ameo!");
		switch (getMasa()) {
		case MOLDE:
			System.out.println("Se debe poner al horno durante 12 minutos");
			break;
		case MEDIOMOLDE:
			System.out.println("Se debe poner al horno durante 7 minutos");
			break;
		case PIEDRA:
			System.out.println("Se debe poner al horno durante 2 minutos");
			break;
		default:
			System.out.println("no se horno un nada!");
			break;
		}

	}

}
