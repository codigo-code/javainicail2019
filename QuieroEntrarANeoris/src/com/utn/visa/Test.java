package com.utn.visa;

import javax.xml.parsers.FactoryConfigurationError;

import com.utn.Comunicar;
import com.utn.IAccion;
import com.utn.controlador.FactoryClass;
import com.utn.controlador.FactoryController;
import com.utn.controlador.SingletoController;
import com.utn.controlador.TipoObjeto;
import com.utn.model.MartinClass;
import com.utn.model.PabloClass;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();

		// polimorfismo
		Test.SubClase sub = t.new SubClase();

		sub.saludo();

		IAccion a1 = t.new SubClase();

		Comunicar p1 = new PabloClass();

		SingletoController cc = SingletoController.newInstance();
		System.out.println(cc.toString());
		cc.setNombre("Maria F");

		SingletoController cc1 = SingletoController.newInstance();
		SingletoController cc2 = SingletoController.newInstance();
		System.err.println(cc1.toString());
		System.err.println(cc2.toString());
		System.out.println(cc2.getNombre());
		
		
		PabloClass p3 = new PabloClass();
		
		p3.setApellido("Sosa");
		
		PabloClass p4 = new PabloClass();
		
		System.out.println("p4 -->  " + p4.getApellido());
		
		p4.setApellido("Fernandez");
		System.out.println("p4 -->  " + p4.getApellido());
		
		System.out.println("p3---> " + p3.getApellido());
		
		
		FactoryController fc = new FactoryController();
		
		Comunicar c4 =  fc.creoInstancia(TipoObjeto.MARTIN);
		MartinClass c5 =  (MartinClass) fc.creoInstancia(TipoObjeto.MARTIN);
		Comunicar c6 = fc.creoInstancia(TipoObjeto.PABLO);
		
		c4.setNombre("martin");
		c6.setNombre("Pablo");
		
		
		
		FactoryClass fclass = new FactoryClass(c4);
		

		FactoryClass fclass1 = new FactoryClass(c6);
		
		fclass.muestroPersona();
		fclass1.muestroPersona();
		
		fc.ordenoLista();
		
		fc.ordenoListaInt();
		
	}
	
	

	class SubClase implements IAccion {

		public void saludo() {
			System.out.println("hola mundo");
		}

		@Override
		public void correr() {
			// TODO Auto-generated method stub

		}
	}
}
