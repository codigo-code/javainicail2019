package com.utn.modelo;

public class Galleta {

	// TODOS LOS ATRIBUTOS SON PRIVADOS

	/*
	 * private ---> solo puede ser leido por la misma clase public --> lo puede ver
	 * la clase correinte y otras clases protected --> la clase corriente + las que
	 * hereden ....
	 */



	// ENCAPSULAMIENTO
	/*
	 * ¨ Todo atributo privado es accedido por un metodo publico tanto sea para
	 * leerlo como escribirlo
	 */


	//Buena practica
	private String nombre;
	private double precio;
	private String descripcion;
	
	// Getter ... devolvemos el atributo 
	
	public  String  getNombre() {
		return nombre;
	}
	
	
	//Setter escribo la variable con el valor del mismo tipo que fue definda
	
	public void setNombre(String nombreParam) {
		if(this.nombre == null) {
			this.nombre = nombreParam;			
		}else {
			System.out.println("NO SE PUEDE MODIFICAR EL ELEMENTO!");
		}
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
	//this hacer referencia a la misma clase
		this.descripcion = descripcion;
	}

	
	
	

}






