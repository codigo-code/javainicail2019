package com.utn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utn.model.Persona;

@RestController
public class PersonaRestController {

	
	@PostMapping(value="/api/pedidoPersona")
	public String pedidoFrula(@RequestBody() Persona p) {
		
		System.out.println(p.getNombre() + " pidio " + p.getProducto().getDescripcion() + " la cantidad de " + p.getProducto().getCantidad());
		
		return "guardamos el pedido";
	}
}
