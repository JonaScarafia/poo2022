import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class GeneroDatos {

	private static Random rand = new Random();

	private static ArrayList<String> apellidos = new ArrayList<>(Arrays.asList("Scarafia", "Pierce", "Romano",
			"Rosales", "Rybier", "Vega", "Moreno", "Garcia", "Perez", "Alonso", "Scarafia2", "Pierce2", "Romano2",
			"Rosales2", "Rybier2", "Vega2", "Moreno2", "Garcia2", "Perez2", "Alonso2"));

	private static ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Fausto", "Jona", "Bianca", "Christian",
			"Pablo", "Gabriel", "Alejandro", "Alicia", "Lucas", "Nicolas", "Fausto2", "Jona2", "Bianca2", "Christian2",
			"Pablo2", "Gabriel2", "Alejandro2", "Alicia2", "Lucas2", "Nicolas2"));

	public static ArrayList<Persona> generarPersona(Integer cantidad) {

		ArrayList<Persona> personas = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {

			String nombre = nombres.get(rand.nextInt(nombres.size()));
			Integer edad = rand.nextInt(100);

			Persona persona = new Persona(nombre, edad);

			personas.add(persona);
		}
		return personas;
	}

	public static ArrayList<Familia> generarFamilias(Integer cantidad) {

		ArrayList<Familia> familias = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			String apellido = apellidos.get(rand.nextInt(apellidos.size()));
			Familia familia = new Familia(apellido, (generarPersona(rand.nextInt(20) + 1)));
            
			familias.add(familia);
		}

		return familias;
	}

	public static void impresionFamilias(ArrayList<Familia> familias) {

		for (Familia familia : familias) {

			familia.mostrarIntegrantes(familia.getApellido());

		}

	}
}
