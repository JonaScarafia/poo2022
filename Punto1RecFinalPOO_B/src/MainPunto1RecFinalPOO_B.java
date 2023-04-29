import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainPunto1RecFinalPOO_B {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<String> sexos = new ArrayList<>(Arrays.asList("Masculino", "Femenino"));
		ArrayList<Deporte> deportes = new ArrayList<>();

		Deporte deporte = new Futbol("Futbol", "14Hs", "Cancha Universidad", new ArrayList<>());
		Deporte deporte2 = new Hockey("Hockey", "18Hs", "Cancha Calafate", new ArrayList<>());
		Deporte deporte3 = new Natacion("Natacion", "16Hs", "Chalet Huergo", new ArrayList<>());

		deportes.add(deporte);
		deportes.add(deporte2);
		deportes.add(deporte3);

		// ArrayList<Deportista> socios = new ArrayList<>();

		// ArrayList<Futbol> lista_futbol = new ArrayList<>();
		// ArrayList<Hockey> lista_hockey= new ArrayList<>();
		// ArrayList<Natacion> lista_natacion= new ArrayList<>();

		for (int i = 0; i < 90; i++) {

			String nombre = "nombre" + i;
			String apellido = "Apellido" + i;
			Integer dni = 1000000 + i;
			Integer edad = rand.nextInt(99) + 1;
			String sexo = sexos.get(rand.nextInt(sexos.size()));

			Deportista deportista = new Deportista(nombre, apellido, dni, edad, sexo);

			Deporte deporte1 = deportes.get(rand.nextInt(deportes.size()));

			deporte1.inscribirDeportista(deportista);

		}
		System.out.println("\n");
		System.out.println("Deportes");
		
		for (Deporte deport : deportes) {
			
			System.out.println(deport.toString());
			deport.mostrarLista(deport);
			
		}
	}
}
