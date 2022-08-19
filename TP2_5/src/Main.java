import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Materia poo = new Materia("POO", "IF153") ;
		Materia algebra = new Materia("Algebra", "183");
		Materia introduccion = new Materia("Introducción a la computación","IF300");
		Materia algoritmica = new Materia("Algoritmica", "500");
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez",new ArrayList<Materia>());
		
		profesor1.añadirMateria(poo);
		profesor1.añadirMateria(algebra);
		profesores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez",new ArrayList<Materia>());
		profesor2.añadirMateria(introduccion);
		profesor2.añadirMateria(algoritmica);
		profesores.add(profesor2);
		
		Profesor profesor3 = new Profesor("Laura", "Perez",new ArrayList<Materia>());
		profesores.add(profesor3);
		
		for (int i = 0; i < profesores.size(); i++) {
			
			System.out.println("Profesor: " + profesores.get(i).getNombre() + " " + profesores.get(i).getApellido());
			System.out.println("Materias: ");
	
			for (int j = 0; j < profesores.get(i).getMaterias().size(); j++) {
				System.out.println(profesores.get(i).getMaterias().get(j).getNombre());
			}
			System.out.println("\n");
		}
	}
}


//ArrayList<Profesor> profesores = new ArrayList<String>();