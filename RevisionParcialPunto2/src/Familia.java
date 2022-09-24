import java.util.ArrayList;
import java.util.Random;


///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class Familia {
	
	// bien!
	private String apellido;
	private ArrayList<Persona> integrantes;

	/* este constructor al final lo usaste mal
	 * o lo usas mandando los parametros completos o haces uno nuevo que no reciba nada
	 *  */
	public Familia(String apellido, ArrayList<Persona> integrantes) {
		super(); // no extendes ninguna clase, no hace falta
		this.apellido = apellido;
		this.integrantes = integrantes;

	}
	
	// en base a como lo hiciste, tu constructor debió ser
	public Familia() {
		this.integrantes = new ArrayList<Persona>();
	}
	
	
	/* no validé que usas y que no
	 * pero solo generá getters y setters que luego uses
	 * todo lo demas, eliminalo
	 *  
	 *  */
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

	/* esto evitemos hacerlo. Esta logica pudo estar en una nueva clase
	 * hecha con el solo fin de generar datos de prueba
	 * no ensucies tus clases haciendo que generen dato de prueba
	 * usa una clase exclusiva para eso que despues puedas eliminar y ya
	 * siempre pensando en un desarrollo real
	 *  */
	public void GenerationSurname() {

		String[] surnames = new String[20];

		for (int i = 0; i < surnames.length; i++) {
			surnames[i]="Apellido"+i;
		}

		Random rndSurnam = new Random();
		/* ¿Por qué sumas 0 y luego restás 0?
		 * sé que no modifica nada, pero queda desprolijo y confuso
		 * suma siempre que el codigo sea claro y sencillo ;)
		 *  */
		Integer surnam = rndSurnam.nextInt(20-0)+0;

		this.apellido = surnames[surnam];

	}


	public void mostrarIntegrantes( String apellido) {

		System.out.println("Familia " +  apellido);
		System.out.println("Integrantes: ");

		for ( Persona persona: integrantes) {
			/* no imprimas un objeto, no siempre te va a funcionar
			 * en todo caso llamá especificamente a toString()
			 * y definilo, poniendo vos manualmente que querés que retorne
			 * y como
			 *  */
			System.out.println(persona);

		}
	}

	/* ok! */
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
