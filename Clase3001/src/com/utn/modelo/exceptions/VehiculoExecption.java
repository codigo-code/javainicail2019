package com.utn.modelo.exceptions;

import java.io.File;
import java.io.FileWriter;

@SuppressWarnings("serial")
public class VehiculoExecption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5441029199069797666L;

	private String mensaje;
	
	public VehiculoExecption(String mensaje) {
		this.mensaje = mensaje;
		this.guardoArchivo();
	}
	
	private void guardoArchivo() {
		try {
			FileWriter fw = new FileWriter(new File("errores.log"),true);
			fw.write(this.mensaje);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println("no se pudo crear el archivo");
			System.out.println(e.getLocalizedMessage());
		}
	}
}
