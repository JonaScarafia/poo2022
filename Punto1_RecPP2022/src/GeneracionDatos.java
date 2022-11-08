import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public abstract class GeneracionDatos {

	private static Random rand = new Random();

	private static ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Juan", "Juana", "Pedro", "Patrick",
			"Pedra", "Fausto", "Pablo", "Alejandro", "Gabriel", "Denis", "Gaston"));

	private static ArrayList<String> apellidos = new ArrayList<>(Arrays.asList("Garcia", "Jgomez", "Gomez", "Scarafia",
			"Moreno", "Rosales", "Vega", "Garcia2", "Vega2", "Solano", "Solano2"));

	private static ArrayList<String> nombresMaterias = new ArrayList<>(Arrays.asList("POO", "Elementos",
			"Logica Discreta", "Laboratorio", "Algebra", "Analisis y Diseño", "Analisis matematico",
			"Expresion de Problemas", "Sistemas Operativos", "Sistemas y Organizaciones", "AYD2"));

	public static Alumno generarAlumno(Integer dni) {

		String nombre = nombres.get(rand.nextInt(nombres.size()));
		String apellido = apellidos.get(rand.nextInt(apellidos.size()));

		return new Alumno(nombre, apellido, dni);

	}

	public static ArrayList<Alumno> generarListaAlumno(Integer cantidad) {
		ArrayList<Alumno> alumnos = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			alumnos.add(generarAlumno(rand.nextInt(5000001) + 1000000));

		}

		return alumnos;
	}

	public static Profesor generarProfesor(Integer nroLegajo) {

		String nombre = nombres.get(rand.nextInt(nombres.size()));
		String apellido = apellidos.get(rand.nextInt(apellidos.size()));
		Integer dni = rand.nextInt(5000001) + 1000000;

		return new Profesor(nombre, apellido, dni, nroLegajo);

	}

	public static ArrayList<Profesor> generarListaProfesor(Integer cantidad, ArrayList<Alumno> alumnos) {
		ArrayList<Profesor> profesores = new ArrayList<>();
		ArrayList<Materia> materias = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			profesores.add(generarProfesor(rand.nextInt(1801) + 5000));
			materias.add(generarMateria("IF000" + i, profesores, alumnos, materias));

		}
		return profesores;
	}

	public static Materia generarMateria(String codigo, ArrayList<Profesor> profesores, ArrayList<Alumno> alumnos,
			ArrayList<Materia> materias) {

		ArrayList<Alumno> alumnoMateria = new ArrayList<>();
		String nombre = nombresMaterias.get(rand.nextInt(nombresMaterias.size()));
		Integer anio = 2022;
		Profesor profesor = profesores.remove(rand.nextInt(profesores.size()));
		Integer cantidadAlumnos = rand.nextInt(6) + 5;

		for (Materia materia : materias) {

			for (int i = 0; i < cantidadAlumnos; i++) {

				// Alumno alumno = alumnos.remove(rand.nextInt(alumnos.size()));

				inscribirAlumno(alumnos, materia);

			}
		}
		return new Materia(nombre, codigo, anio, profesor);

	}

//	public static ArrayList<Materia> generarListaMaterias(Integer cantidad,ArrayList<Profesor> profesores,
//			ArrayList<Alumno> alumnos){
//		
//		ArrayList<Materia> materias = new ArrayList<>();
//		
//		for (int i = 0; i < cantidad; i++) {
//			
//			materias.add(generarMateria("IF000"+i, profesores, alumnos));
//		}
//		
//		return materias;
//	}

	 static void inscribirAlumno(ArrayList<Alumno> alumnos, Materia materia) {

		try {
			
			materia.inscribirAlumno(alumnos.remove(rand.nextInt(alumnos.size())));
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
			inscribirAlumno(alumnos, materia);
		
		}
		
	}
	
	public static void mostrarInformacion(ArrayList<Alumno> alumnos) {
		
		
		for (Alumno alumno : alumnos) {
			
			alumno.imprimirHistorialAcademico();
		}
		
		
	}

}
