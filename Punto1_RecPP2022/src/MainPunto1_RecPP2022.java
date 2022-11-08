import java.util.ArrayList;import java.util.Iterator;
import java.util.Random;

public class MainPunto1_RecPP2022 {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos = new ArrayList<>();
		ArrayList<Profesor> profesores = new ArrayList<>();
		ArrayList<Materia> materias = new ArrayList<>();

		Random rand = new Random();

///////////// CREO ALUMNOS /////////////////////////////////////////////////////////////////////////////////

		for (int i = 0; i < 30; i++) {

			alumnos.add(new Alumno("Nombre" + i, "apellido" + i, rand.nextInt(5000001) + 1000000));

		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CREO PROFESOR
		Profesor profesor;

		for (int i = 0; i < 5; i++) {

			profesor = new Profesor("Profesor-" + i, "Apellido" + i, rand.nextInt(5000001) + 1000000,
					new Random().nextInt(3001) + 5000);
			profesores.add(profesor);
			materias.add(new Materia("NombreMateria-" + i, "CodigoABC" + i, 2022, profesor));
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////		

		// INSCRIBO ALUMNOS A MATERIAS
		for (Materia materia : materias) {

			Integer cantAlumnos = rand.nextInt(6) + 10;

			for (int i = 0; i < cantAlumnos; i++) {

				 inscribirAlumno(alumnos, materia);

			}
			for (Alumno alumno : materia.getListaAlumnos()) {
				alumno.ingresarNota(materia, rand.nextInt(11) + 10);
			}

		}
/////////////////////////////////////////////////////////////////////////////////////////////		

		// IMPRIMO MATERIAS Y LISTADO DE ALUMNOS

		for (Materia materia : materias) {

			System.out.println(materia.toString() + "\n" + materia.getProfesor().toString() + "n");
			materia.listadoAlumnos();

		}

/////////////////////////////////////////////////////////////////////////////////////////////

		// IMPRIMIR HISTORIAL
		for (int i = 0; i <10 ; i++) {

			Alumno alumno = alumnos.get(rand.nextInt(alumnos.size()));
			alumno.imprimirHistorialAcademico();

		}

///////////////////////////////////////////////////////////////////////////////////////			

	}

	static void inscribirAlumno(ArrayList<Alumno> alumnos, Materia materia) {

		try {

			materia.inscribirAlumno(alumnos.get(new Random().nextInt(alumnos.size())));

		} catch (Exception e) {

			System.err.print(e.getMessage());
			inscribirAlumno(alumnos, materia);

		}

	}

}
