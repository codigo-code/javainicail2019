package com.utn.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.model.Pregunta;
import com.utn.model.dao.PreguntaDAO;

@RestController
public class PreguntaController {

	List<Pregunta> preguntas = new ArrayList<Pregunta>();



	@GetMapping(value = "/obtenerPreguntas")
	public String getAllPreguntas() {

		Gson respuestas = new Gson();
		cargarPreguntas();
		return respuestas.toJson(preguntas).toString();
	}

	@GetMapping(value = "/obtenerPregunta/{id}")
	public String getPreguntaById(@PathVariable("id") int id) {
		Gson gson = new Gson();

		// aca retormanos mediante el id la pregunta ... ( de la lista)
		return gson.toJson(preguntas.get(id));
	}

	private void cargarPreguntas() {

		try {
			File file = new File("Preguntas_Guido.txt");
			PreguntaDAO pdaoDao = PreguntaDAO.createInstance();
			BufferedReader br = new BufferedReader(new FileReader(file));

			int id=0;
			String st;
			while ((st = br.readLine()) != null) {
				this.preguntas.add(new Pregunta(id, st.split("-")[0], st.split("-")[1]));
				pdaoDao.guardoPregunta(this.preguntas.get(id));
				id++;
			}

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
