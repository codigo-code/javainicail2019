package com.utn.controlador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.utn.Comunicar;
import com.utn.model.MartinClass;
import com.utn.model.PabloClass;

public class FactoryController {

	List<Integer> number;
	List<Integer> listaOrdenada;

	// Factoria de metodos a partir de un enum
	public Comunicar creoInstancia(TipoObjeto tipo) {
		switch (tipo) {
		case PABLO:
			return new PabloClass();
		case MARTIN:
			return new MartinClass();
		default:
			return null;
		}
	}

	public FactoryController() {
		this.number = new ArrayList<Integer>();
		this.listaOrdenada=new ArrayList<Integer>();
		this.number.add(3);
		this.number.add(2);
		this.number.add(5);
		this.number.add(4);
		this.number.add(1);

	}

	public void ordenoLista() {
		this.number.sort(Comparator.naturalOrder());
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}
	}

	public void ordenoListaInt() {

		int aux = 0;
		for (int i = 0; i < number.size(); i++) {

			if (aux < number.get(i)) {
				aux = number.get(i);
				
				listaOrdenada.add(aux);
			}else {
				break;
			}

			ordenoListaInt();
			
		}
	}
}
