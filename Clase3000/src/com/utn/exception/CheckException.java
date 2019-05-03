package com.utn.exception;

import java.io.File;
import java.io.FileWriter;

@SuppressWarnings("serial")
public class CheckException  extends Exception{

	private static final long serialVersionUID = 3808460815532046487L;
	
	
	private String mensaje;
	
	public CheckException(String mensaje) {
		this.mensaje=mensaje;
	}
	
	
	public void guardoErrorEnArchivo() {
		try {
			// primero se crean el archivo
			File archivo= new File("logErrores.txt");
			FileWriter fw = new FileWriter(archivo,true);
			fw.write(this.mensaje);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println("No se pudo escribir en el archivo");
		}
	}
	
	
	
}
