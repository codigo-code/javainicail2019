package com.utn.controller;

import com.utn.exception.UnCheckException;
import com.utn.model.Piloto;

public class PilotoControlador {

	
	public void creoPiloto()throws UnCheckException {
		
		Piloto p=null;
		
		if(p==null) {
			throw new UnCheckException("Exploto porque no se creo el objto");
		}
		
		p.manejarEstado();
	}
}
