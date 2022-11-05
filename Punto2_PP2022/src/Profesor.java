
public class Profesor extends Persona {

	private Integer nroLegajo;

	public Profesor(String nombre, Integer edad, Integer nroLegajo) {
		super(nombre, edad);
		this.nroLegajo = nroLegajo;
	}

	
	public String toString() {
		return super.toString() + " Profesor numero de Legajo= " + nroLegajo;
	}
	
}
