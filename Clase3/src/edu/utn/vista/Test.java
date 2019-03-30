package edu.utn.vista;

import java.util.Arrays;
import java.util.function.Function;

public class Test {

	// punto de incio
	public static void main(String[] args) {

		// variable local para el metodo main de tipo String

		String message = "hola mundo";
		saludar(message);

		// invocamos al IMC donde le pasamos la altura y el peso

//		double resultado = imc(99.0, 1.95); // una funcion siempre retorna un valor

		
//		if (resultado < 18) {
//			System.out.println("Flaque escopeta");
//		} else if (resultado >= 18 && resultado <= 25) {
//			System.out.println("Hace ejercicio igual pero vas bien");
//		} else if (resultado > 25 && resultado < 29) {
//			System.out.println("afloja los postres");
//		} else {
//			System.out.println("gorde pedorre");
//		}

//		System.out.println(resultado);
		
		
		System.out.println("la suma de 2 + 2 = " + sumoDosNumeros(2, 2));
		
		System.out.println(sumoDosNumeros(sumoDosNumeros(1, sumoDosNumeros(19, 32)), 2));
		
		muestroValores("Ned", "Flanders", 15);
		
		String a = "pedo";
		String b="caa";
		
		Arrays.asList(a,b).forEach(System.out::print);
		
		
	}

	// Procedimiento que recibe un parametro de tipo String ( cadena)
	public static void saludar(String mensaje) {
		System.out.println(mensaje);
	}

	// Funcion donde chequeamos el IMC o indice de masa coroporal
	public static String imc(Double altura) {

		double resultado = 1.90 / (altura * altura);
		return "Pedo";
	}

	//funcion de tipo entero que retora la suma de los dos parametros de entrada
	public static int sumoDosNumeros(int num1, int num2) {
		return num1 + num2;
	}

	public static void muestroValores(String nombre, String  apellido, int edad) {
		System.out.println("su nombre es " + nombre);
		System.out.println("su apellido es " + apellido);
		if(edad < 18 ) {
			System.out.println("Es un puber");
		}else if(edad >18 && edad < 60) {
			System.out.println("Estas en la cresta de la ola");
		}else {
			System.out.println("mas cerca del arpa que de la guitarra");
		}
	}
	
	// Esto es un comentario

	// existen dos tipos de metodos para utilizar en java
	/*
	 * 1) funciones 2) procedimientos
	 * 
	 * funcion: es un metodo que resuelve una serie de sentencias donde puede
	 * recibir parametros o no de entrara pero debe DEVOLVER UN VALOR POR MEDIO DE
	 * LA PALABRA RESERVADA return por ejemplo
	 * 
	 * public String saludo(){
	 * 
	 * return "hola mundo"; }
	 * 
	 * Ejemplo 2
	 * 
	 * public double sin(double valor){
	 * 
	 * double resultado = valor * valor /2;
	 * 
	 * return resutaldo; }
	 * 
	 * 
	 * =========================== El procedimiento es un metodo que no retorna
	 * valor simplementemente ejecuta procesos de forma secuencial se antepone la
	 * palabra reservada void
	 * 
	 * ejemplo
	 * 
	 * public void despedirse(String mensaje){
	 * 
	 * System.out.println(mensaje); }
	 * 
	 * 
	 * 
	 */
	
	public void sarasa() {
		Function<Double, String> f = Test::imc;
		 System.out.println(f.apply(8.0));
		
		ccc(Test::imc);
	}
	
	public void ccc(String aasd) {
		System.out.println(aasd);
	}

}
