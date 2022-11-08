import java.util.ArrayList;

public class Materia {

	private String nombre;
	private String codigo;
	private Integer anio;
	private Profesor profesor;
	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public Materia(String nombre, String codigo, Integer anio, Profesor profesor) {

		this.nombre = nombre;
		this.codigo = codigo;
		this.anio = anio;
		this.profesor = profesor;

	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public void inscribirAlumno(Alumno alumno) throws Exception {

		if (!listaAlumnos.contains(alumno)) {
			listaAlumnos.add(alumno);
		} else {
			throw new Exception("El Alumno ya se encuentra inscripto en la materia \n");
		}

	}

	public void listadoAlumnos() {
System.out.println("Los alumnos Inscriptos a la materia son los siguientes \n");
		for (Alumno alumno : listaAlumnos) {

			System.out.println(alumno.toString());

		}
		
		System.out.println("\n");

	}

	public String toString() {

		return " Materia= " + nombre + " Codigo Materia= " + codigo + ", Anio= " + anio;

	}

}
