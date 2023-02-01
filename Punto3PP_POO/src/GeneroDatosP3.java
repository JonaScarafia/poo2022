import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class GeneroDatosP3 {

	private static Random rand = new Random();

	private static ArrayList<String> marcas = new ArrayList<>(
			Arrays.asList("Patrick", "Whirpool", "Sacachispas", "Kohinoor", "Stanley", "Samsung", "Dream"));

	private static ArrayList<String> colores = new ArrayList<>(
			Arrays.asList("Blanco", "Gris", "Negro", "Plateado", "Azul", "Mal Gusto"));

	public static ArrayList<Heladera> generoListaHeladeras(Integer cantidad) {

		ArrayList<Heladera> heladeras = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			String modelo = "Heladera Modelo-A" + rand.nextInt(1101);
			Integer precio = rand.nextInt(7501) + 1000;
			String marca = marcas.get(rand.nextInt(marcas.size()));
			String color = colores.get(rand.nextInt(colores.size()));
			Integer capacidadTotal = rand.nextInt(31) + 10;
			Integer frezzer = rand.nextInt(16) + 5;

			Heladera heladera = new Heladera(modelo, precio, marca, color, capacidadTotal, frezzer);

			heladeras.add(heladera);

		}

		Collections.shuffle(heladeras);

		return heladeras;
	}

	public static ArrayList<Cocina> generoListaCocinas(Integer cantidad) {

		ArrayList<Cocina> cocinas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			String modelo = "Cocina Modelo-B" + rand.nextInt(1201);
			Integer precio = rand.nextInt(7501) + 1000;
			String marca = marcas.get(rand.nextInt(marcas.size()));
			String color = colores.get(rand.nextInt(colores.size()));
			Boolean electrica = rand.nextBoolean();

			Cocina cocina = new Cocina(modelo, precio, marca, color, electrica);

			cocinas.add(cocina);

		}
		Collections.shuffle(cocinas);
		return cocinas;
	}

	public static ArrayList<Lavarropas> generoListaLavarropas(Integer cantidad) {

		ArrayList<Lavarropas> lavarropas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			String modelo = "Lavarropas Modelo-C" + rand.nextInt(1301);
			Integer precio = rand.nextInt(7501) + 1000;
			String marca = marcas.get(rand.nextInt(marcas.size()));
			String color = colores.get(rand.nextInt(colores.size()));
			Boolean cargaFrontal = rand.nextBoolean();
			Integer capacidad = rand.nextInt(41) + 10;

			Lavarropas lavarropa = new Lavarropas(modelo, precio, marca, color, cargaFrontal, capacidad);

			lavarropas.add(lavarropa);

		}
		Collections.shuffle(lavarropas);
		return lavarropas;
	}

	public static ArrayList<Electrodomestico> generoListaRecomendados(ArrayList<Heladera> heladeras,
			ArrayList<Cocina> cocinas, ArrayList<Lavarropas> lavarropas) {

		ArrayList<Electrodomestico> recomendados = new ArrayList<>();

		recomendados.addAll(heladeras);
		recomendados.addAll(cocinas);
		recomendados.addAll(lavarropas);

		Collections.shuffle(recomendados);
		return recomendados;

	}

	public static void impresionListas(ArrayList<Heladera> heladeras, ArrayList<Cocina> cocinas,
			ArrayList<Lavarropas> lavarropas, ArrayList<Electrodomestico> recomendados) {

		System.out.println(">>> LISTA DE COCINAS >>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(cocinas.remove(rand.nextInt(cocinas.size())));

		}
		System.out.println("\n");

		System.out.println(">>> LISTA DE HELADERAS >>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(heladeras.remove(rand.nextInt(heladeras.size())));

		}

		System.out.println("\n");

		System.out.println(">>> LISTA LAVARROPAS >>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(lavarropas.remove(rand.nextInt(lavarropas.size())));

		}

		System.out.println("\n");

		System.out.println(">>>> LISTADO DE RECOMENDADOS >>>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(recomendados.remove(rand.nextInt(recomendados.size())));

		}

	}

}
