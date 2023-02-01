
public class Alumno extends Persona {

	private HistorialAcademico historial;

	public Alumno(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);

		this.historial = new HistorialAcademico();
	}

	public void ingresarNota(Materia materia, Integer nota) {
		this.historial.agregarMateria(materia, nota);
	}

	public void imprimirHistorialAcademico() {
		System.out.println(">>> Datos Personales del Alumno >>> \n" + super.toString() + "\n"
				+ this.historial.imprimirHistorial());
		System.out.println("\n");
	}

}
