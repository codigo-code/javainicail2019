package com.utn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.model.dao.PersonaDao;
import com.utn.model.entity.Persona;

@RestController
public class PersonaController {

	@Autowired
	private PersonaDao persona;
	
	@Autowired
	private Gson gson;
	
	@GetMapping(value="/listaPersona")
	public String getAllPersonas() {
		
		return gson.toJson(persona.findAll());
	}
	
	@GetMapping(value="/insert")
	public String guardar() {
		Persona p = new Persona();
		p.setNombre("Bertha");
		p.setDni(12345);
		persona.save(p);
		
		return "no sabemos fijate";
	}
}

