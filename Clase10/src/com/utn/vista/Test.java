package com.utn.vista;

import java.util.List;

import com.utn.dao.ConnectionMySQL;
import com.utn.modelo.Auto;

public class Test {

	public static void main(String[] args) {
		ConnectionMySQL db = new ConnectionMySQL();

		db.getAutos();

//		boolean inserto = db.insertAuto("mitsubishi", "eclipse", "rojo caca");
//
//		if (!inserto)
//			System.out.println("inserto");
//		else
//			System.out.println("no inserto");
		
		
		if(db.updateAuto("rojo torino", 5))
			System.out.println("se actualizo");
		else
			System.out.println("hubo un error");
		
		
		if(db.deleteAutoById(6))	
			System.out.println("Se borro correctamente");
		else
			System.out.println("error al borrar!");
		
		
		db.getListOfAutos().forEach(item ->{
			System.out.println(item);
		});
		
	}
}
