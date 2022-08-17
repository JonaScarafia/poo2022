
/*
 * 
 * Corrija el siguiente para que funcione realizando la minima cantidad de cambios y solo
 * en la clase alumno
 * 
 * 
 */

public class Main {

		public static void main(String[] args) {
			Alumno alumno1 = new Alumno("Alejandro","Rojas",11111111);
			
			Alumno alumno2 = new Alumno("Martin", "Rosales",11111112);
			
			System.out.println("Nombre y apellido: " + alumno1.getNombre() + " - DNI: " +
			alumno1.getDni());
			System.out.println("Nombre y apellido: " + alumno2.getApellido() + " - DNI: " +
			alumno2.getDni());



	}

}
