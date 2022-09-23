import java.util.ArrayList;
import java.util.Random;


///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class Familia {
	
	private String apellido;
	private ArrayList<Persona> integrantes;

	public Familia(String apellido, ArrayList<Persona> integrantes) {
		super();
		this.apellido = apellido;
		this.integrantes = integrantes;

	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public void agregarIntegrante(Persona integrantes) {

		getIntegrantes().add(integrantes);

	}


	public void GenerationSurname() {

		String[] surnames = new String[20];

		for (int i = 0; i < surnames.length; i++) {
			surnames[i]="Apellido"+i;
		}

		Random rndSurnam = new Random();
		Integer surnam = rndSurnam.nextInt(20-0)+0;

		this.apellido = surnames[surnam];

	}


	public void mostrarIntegrantes( String apellido) {

		System.out.println("Familia " +  apellido);
		System.out.println("Integrantes: ");

		for ( Persona persona: integrantes) {

			System.out.println(persona);

		}
	}


	public void calculateProm (ArrayList<Persona> integrantes) {

		Integer sumAge =0;
		Integer promAge;

		for (int i = 0; i <integrantes.size(); i++) 

		{

			sumAge= sumAge + integrantes.get(i).getEdad();

		}

		promAge=sumAge/integrantes.size();

		System.out.println("Promedio de edad: "+ promAge+"\n");
		System.out.println("\n");
	}		
} 
