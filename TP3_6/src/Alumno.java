import java.util.ArrayList;

public class Alumno extends Persona {

	ArrayList<String> materias = new ArrayList<>();
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}
	public ArrayList<String> getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}
	public void agregarMateria(String materia) {
		this.materias.add(materia);
	}
	public String materia() {
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg;
	}

}
