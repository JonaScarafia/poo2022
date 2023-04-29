import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainRecFinalPooPP_Punto1 {

	public static void main(String[] args) {

		Random ran = new Random();

		ArrayList<String> sexos = new ArrayList<>(Arrays.asList("Masculino", "Femenino"));

		ArrayList<Deporte> listaDeportes = new ArrayList<>();

		Deporte deporte1 = new Futbol("14 hs", "Cancha Secundaria");
		Deporte deporte2 = new Hockey("18 hs", "Cancha Club Calafate");
		Deporte deporte3 = new Natacion("10 hs", "Chalet Huergo");

		listaDeportes.add(deporte1);
		listaDeportes.add(deporte2);
		listaDeportes.add(deporte3);

		for (int i = 0; i < 90; i++) {

			String nombre = "Nombre" + i;
			String apellido = "Apellido" + i;
			Integer dni = ran.nextInt(80001) + 10000;
			Integer edad = ran.nextInt(98) + 1;
			String sexo = sexos.get(ran.nextInt(sexos.size()));

			Deportista deportista = new Deportista(nombre, apellido, dni, edad, sexo);

			Deporte deport = listaDeportes.get(ran.nextInt(listaDeportes.size()));

			deport.agregarDeportista(deportista);

		}

		for (Deporte deporte : listaDeportes) {
System.out.println("\n");
			System.out.println(deporte.toString() + "\n");
			deporte.mostrarDeportistas();

		}

	}
}
