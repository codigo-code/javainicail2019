package com.utn.exception;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

@SuppressWarnings("serial")
public class UnCheckException extends RuntimeException{


	private static final long serialVersionUID = -5732197079408673928L;

	private String mensaje;
	
	public UnCheckException(String mensaje) {
		this.mensaje=mensaje;
		// lo ponemos aqui porque no me va a requerir el try catch donde lo llame
		guardoEnArchivo();
	}
	
	public void guardoEnArchivo() {
		try {
			FileWriter fw = new FileWriter(new File("RunTimeException"+new Date().getTime()+".log"));
			fw.write(this.mensaje);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
