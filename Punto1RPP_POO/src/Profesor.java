
public class Profesor extends Persona{

	private String nroLegajo;

	public Profesor(String nombre, String apellido, Integer dni, String nroLegajo) {
		super(nombre, apellido, dni);
		
		this.nroLegajo = nroLegajo;
	}

	
	public String toString() {
		return super.toString()+ " Nro de Legajo=" + nroLegajo;
	}
	
}
