package com.utn.model;

public class Pregunta {

	private int id;

	private String pregunta;
	private String respuesta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Pregunta(int id, String pregunta, String respuesta) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

}
