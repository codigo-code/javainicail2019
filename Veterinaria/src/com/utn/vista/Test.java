package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.VeterinariaControlador;
import com.utn.modelo.Animal;
import com.utn.modelo.TipoAnimal;

public class Test {

	public static void main(String[] args) {
		
		VeterinariaControlador vc = new VeterinariaControlador();
		
		Animal a1 = new Animal(TipoAnimal.PERRO);
		a1.setNombre("Sparkly");
		a1.setCausa("atropello");
		a1.setEdad(22);
		a1.setRaza("Caniche toy");
		
		Animal a2 = new Animal(TipoAnimal.CONEJO);
		a2 = pidoDatos(a2);
		
		System.out.println(a2);
		
		Animal a3 = new Animal(TipoAnimal.CONEJO);
		Animal a4 = new Animal(TipoAnimal.CONEJO);
		Animal a5 = new Animal(TipoAnimal.CONEJO);
		
		
		vc.atiendoAnimal(a1, 1);
		vc.atiendoAnimal(a2, 1);
		vc.atiendoAnimal(a3, 1);
		vc.atiendoAnimal(a4, 1);
		vc.atiendoAnimal(a5, 1);
		vc.atiendoAnimal(a1, 1);
		
		
	}
	
	
	private static Animal pidoDatos(Animal a) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ingrese el nombre");
		
		a.setNombre(s.nextLine());
		System.out.println("ingrese la raza");
		a.setRaza(s.nextLine());
		System.out.println("xq mierda lo trajiste");
		a.setCausa(s.nextLine());
		System.out.println("Ingrese la edad");
		a.setEdad(s.nextInt());
		return a;
	}

}
