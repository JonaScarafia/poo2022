import java.util.ArrayList;

public class Profesor {

	private String nombre;
	private String apellido;

	private ArrayList<Materia> materias;

	//	
	//	public Profesor() {
	//		
	//	this("","",new ArrayList<Materia>());
	//	
	//	}

	public Profesor(String nombre, String apellido, ArrayList<Materia> materias) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = materias;

	}

	public String getNombre() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public void a�adirMateria(Materia materia) {
		getMaterias().add(materia);

	}
}
