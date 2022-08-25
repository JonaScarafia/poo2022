import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainPunto9 {

	public static void main(String[] args) {


		Familia family1 = new Familia("Gonzalez","Ameghino 123",new ArrayList<Persona>(),3);

		Persona person1 = new Persona("Fausto", Genero.HOMBRE, "administrativo");
		family1.agregarIntegrante(person1);
		Persona person2 = new Persona("Alicia", Genero.MUJER, "Ama de Casa");
		family1.agregarIntegrante(person2);
		Persona person3 = new Persona("Fausto", Genero.NOBINARIE, "Estudiante Facultad Ciencia Socilaes");
		family1.agregarIntegrante(person3);



		Familia family2 = new Familia("Garcia","San Martin 123",new ArrayList<Persona>(),2);

		Persona persona1 = new Persona("Jona", Genero.HOMBRE, "Programador Universitario");
		family2.agregarIntegrante(persona1);
		Persona persona2 = new Persona("Pichichen", Genero.NULO, "Mascota");
		family2.agregarIntegrante(persona2);


		Familia family3 = new Familia("Perez","Sarmiento 123",new ArrayList<Persona>(),4);

		Persona pers1 = new Persona("Juan", Genero.HOMBRE, "Petrolero");
		family3.agregarIntegrante(pers1);
		Persona pers2 = new Persona("Monica", Genero.MUJER, "Municipal");
		family3.agregarIntegrante(pers2);
		Persona pers3 = new Persona("Ariel", Genero.HOMBRE, "Estudiante");
		family3.agregarIntegrante(pers3);
		Persona pers4 = new Persona("Margarita", Genero.TRANS, "Comercio");
		family3.agregarIntegrante(pers4);


		//En mi main deberia poder agregar las familias en un array para poder devolver la cantidad, de las familias

		//		System.out.println(family1.toString());
		//	family1.mostrarIntegrantes(family1.getApellido());
		//		
		//		System.out.println(family2.toString());
		//		family2.mostrarIntegrantes(family2.getApellido());
		//		
		//		System.out.println(family3.toString());
		//		family3.mostrarIntegrantes(family3.getApellido());
		//		

		/// Punto 10
		//		
		//////String familia = JOptionPane.showInputDialog("Ingrese nombre de familia");
		//////		
		//////		if (family2.getApellido().equals(familia)) {
		//////			JOptionPane.showMessageDialog(null, "los integrantes de la familia "+ familia + " son " +"\n"+ family2.getApellido());
		//////			
		////
		////			
		//			//JOptionPane.showMessageDialog(null, "Correcto!!! :) " + contra + " Es la contrasenia de " + persona.getNombre());
		//			
		//		}
	}
	
}
