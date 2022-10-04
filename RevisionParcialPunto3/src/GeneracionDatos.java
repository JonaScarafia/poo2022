import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GeneracionDatos {

	private static Random rand = new Random();

	private static ArrayList<String> marcas = new ArrayList<>(
			Arrays.asList("Sanyo", "Dreams", "Whirpool", "Patrick", "Orbi"));
	private static ArrayList<String> colores = new ArrayList<>(
			Arrays.asList("Blanco", "Plateado", "Negro", "Azul", "Verde"));

	public static Cocina generarCocina(String modelo) {

		String marca = marcas.get(rand.nextInt(marcas.size()));
		String color = colores.get(rand.nextInt(colores.size()));
		Integer precio = rand.nextInt(50000 - 1000 + 1) + 1000;

		Boolean electrica = rand.nextBoolean();

		Cocina cocina = new Cocina(modelo, marca, color, precio, electrica);

		return cocina;

	}

	public static Heladera generarHeladera(String modelo) {

		String marca = marcas.get(rand.nextInt(marcas.size()));
		String color = colores.get(rand.nextInt(colores.size()));
		Integer precio = rand.nextInt(50000 - 1000 + 1) + 1000;

		Integer capacidadTotal = rand.nextInt(10 - 2 + 1) + 2;
		Integer frezzer = rand.nextInt(5 - 3 + 1) + 3;

		Heladera heladera = new Heladera(modelo, marca, color, precio, capacidadTotal, frezzer);

		return heladera;

	}

	public static Lavarropa generarLavarropa(String modelo) {

		String marca = marcas.get(rand.nextInt(marcas.size()));
		String color = colores.get(rand.nextInt(colores.size()));
		Integer precio = rand.nextInt(50000 - 1000 + 1) + 1000;

		Boolean cargaFrontal = rand.nextBoolean();
		Integer capacidad = rand.nextInt(40 - 5 + 1) + 5;

		Lavarropa lavarropa = new Lavarropa(modelo, marca, color, precio, cargaFrontal, capacidad);

		return lavarropa;

	}

	public static ArrayList<Cocina> generarListaCocinas(Integer cantidad) {
		ArrayList<Cocina> listaCocinas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {
			listaCocinas.add(generarCocina("ModeloA" + (i + 1)));
		}
		Collections.shuffle(listaCocinas);

		return listaCocinas;
	}

	public static ArrayList<Heladera> generarListaHeladeras(Integer cantidad) {
		ArrayList<Heladera> listaHeladeras = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {
			listaHeladeras.add(generarHeladera("ModeloB" + (i + 1)));

		}
		Collections.shuffle(listaHeladeras);
		return listaHeladeras;
	}

	public static ArrayList<Lavarropa> generarListaLavarropas(Integer cantidad) {
		ArrayList<Lavarropa> listaLavarropas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {
			listaLavarropas.add(generarLavarropa("ModeloC" + (i + 1)));
		}
		Collections.shuffle(listaLavarropas);
		return listaLavarropas;
	}

	public static ArrayList<Electrodomestico> generarListaElectrodomesticos(ArrayList<Cocina> listaCocinas,
			ArrayList<Heladera> listaHeladeras, ArrayList<Lavarropa> listaLavarropas) {

		ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		listaElectrodomesticos.addAll(listaCocinas);
		listaElectrodomesticos.addAll(listaHeladeras);
		listaElectrodomesticos.addAll(listaLavarropas);

		Collections.shuffle(listaElectrodomesticos);

		return listaElectrodomesticos;
	}

	public static void impresionListas(ArrayList<Cocina> listaCocinas, ArrayList<Heladera> listaHeladeras,
			ArrayList<Lavarropa> listaLavarropas, ArrayList<Electrodomestico> listaElectrodomesticos) {

		System.out.println("**** Lista de Cocinas ******");
		for (int i = 0; i < 3; i++) {

			System.out.println(listaCocinas.remove(rand.nextInt(listaCocinas.size())).toString());

		}

		System.out.println("\n");
		System.out.println("**** Lista de Heladeras ******");
		for (int i = 0; i < 3; i++) {

			System.out.println(listaHeladeras.remove(rand.nextInt(listaHeladeras.size())).toString());

		}
		System.out.println("\n");
		System.out.println("**** Lista de Lavarropas ******");
		for (int i = 0; i < 3; i++) {

			System.out.println(listaLavarropas.remove(rand.nextInt(listaLavarropas.size())).toString());

		}

		System.out.println("\n");

		System.out.println("**** Lista General de Recomendados ******");
		for (int i = 0; i < 3; i++) {

			System.out.println(listaElectrodomesticos.remove(rand.nextInt(listaElectrodomesticos.size())).toString());

		}
	}
}
