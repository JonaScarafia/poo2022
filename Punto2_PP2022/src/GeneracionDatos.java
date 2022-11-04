
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeneracionDatos {

	private static Random rand = new Random();

	private static ArrayList<String> apellidos = new ArrayList<>(Arrays.asList("Perez", "Gonzalez", "Garcia", "Vega",
			"Rosales", "Moreno", "Scarafia", "Romano", "Rybier", "Carrillo", "Perez2", "Gonzalez2", "Garcia2", "Vega2",
			"Rosales2", "Moreno2", "Scarafia2", "Romano2", "Rybier2", "Carrillo2"));

	private static ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Pablo", "Tomas", "Christian", "Jona",
			"Gabriel", "Alejandro", "Fausto", "Denis", "Franco", "Alex", "Pablo2", "Tomas2", "Christian2", "Jona2",
			"Gabriel2", "Alejandro2", "Fausto2", "Denis2", "Franco2", "Alex2"));

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
