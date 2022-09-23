import java.util.ArrayList;

public class Docente extends Persona{
	private String materia;
	
	public Docente(String nombre, String apellido, String materia) {
		super(nombre, apellido);
		this.materia = materia;
	}
	public Docente(String nombre, String apellido, String materia, String anio) {
		super(nombre, apellido);
		this.materia = materia;
	}
	/*
	 
	Acá se Aplicó Polimorfismo Estatico por que tengo dos constructores y yo como programador decido que constructor utilizo ya que son dos
	maneras de hacer lo mismo ese es el concepto de poliimorfismo.
	
	*/
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String materia() {
		return "El docente dicta la siguiente clase " + this.materia +"\n";
	}
}
