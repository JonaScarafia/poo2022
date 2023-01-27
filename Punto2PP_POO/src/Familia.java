import java.util.ArrayList;

public class Familia {

	private String apellido;
	private ArrayList<Persona> personas = new ArrayList<>();

	public Familia(String apellido, ArrayList<Persona> personas) {

		this.apellido = apellido;
		this.personas = personas;

	}

	public void mostrarIntegrantes(String apellido) {

		System.out.println("Familia: " + apellido);
		this.promedioEdad();

		System.out.println("Integrantes: ");

		for (Persona persona : personas) {

			System.out.println(persona.getNombre() + " " + persona.getEdad()+" años");

		}

		System.out.println("\n");

	}
	
	public void promedioEdad() {
		
		Integer sumatoriaEdad=0;
		Integer totalPersonas =personas.size();
		Integer promedioEdad;
		
		for (Persona persona : personas) {
			
			sumatoriaEdad= sumatoriaEdad + persona.getEdad();
			
		}
		
		promedioEdad = sumatoriaEdad/totalPersonas;
		
		System.out.println("Promedio de edad: "+promedioEdad);
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
}
