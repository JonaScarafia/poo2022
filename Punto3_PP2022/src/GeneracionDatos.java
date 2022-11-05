import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public abstract class GeneracionDatos {

	private static Random rand = new Random();

	private static ArrayList<String> marcas = new ArrayList<>(
			Arrays.asList("Patrick", "Whirpool", "Sanyo", "Philips", "Sonic", "Dream"));
	private static ArrayList<String> colores = new ArrayList<>(
			Arrays.asList("Blanco", "Plateado", "Negro", "Azul", "MultiColor"));

	public static Heladera generarHeladera(String modelo) {

		Integer precio = rand.nextInt(50001) + 10000;
		String color = colores.get(rand.nextInt(colores.size()));
		String marca = marcas.get(rand.nextInt(marcas.size()));
		Integer capacidadTotal = rand.nextInt(46) + 5;
		Integer frezzer = rand.nextInt(26) + 5;

		return new Heladera(modelo, precio, marca, color, capacidadTotal, frezzer);
	}

	public static Cocina generarCocina(String modelo) {

		Integer precio = rand.nextInt(50001) + 10000;
		String color = colores.get(rand.nextInt(colores.size()));
		String marca = marcas.get(rand.nextInt(marcas.size()));
		Boolean electrica = rand.nextBoolean();

		return new Cocina(modelo, precio, marca, color, electrica);
	}

	public static Lavarropa generarLavarropa(String modelo) {

		Integer precio = rand.nextInt(50001) + 10000;
		String color = colores.get(rand.nextInt(colores.size()));
		String marca = marcas.get(rand.nextInt(marcas.size()));
		Boolean cargaFrontal = rand.nextBoolean();
		Integer capacidad = rand.nextInt(41) + 10;

		return new Lavarropa(modelo, precio, marca, color, cargaFrontal, capacidad);
	}

	public static ArrayList<Heladera> generarListaHeladeras(Integer cantidad) {
		ArrayList<Heladera> heladeras = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			heladeras.add(generarHeladera("ModeloA " + i));

		}
		Collections.shuffle(heladeras);

		return heladeras;
	}

	public static ArrayList<Cocina> generarListaCocinas(Integer cantidad) {
		ArrayList<Cocina> cocinas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			cocinas.add(generarCocina("ModeloB " + i));

		}
		Collections.shuffle(cocinas);
		return cocinas;
	}

	public static ArrayList<Lavarropa> generarListaLavarropas(Integer cantidad) {
		ArrayList<Lavarropa> lavarropas = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {

			lavarropas.add(generarLavarropa("ModeloC " + i));

		}
		Collections.shuffle(lavarropas);
		return lavarropas;

	}

	public static ArrayList<Electrodomestico> generarListaElectrodomesticos(ArrayList<Heladera> heladeras,
			ArrayList<Cocina> cocinas, ArrayList<Lavarropa> lavarropas) {
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

		electrodomesticos.addAll(heladeras);
		electrodomesticos.addAll(cocinas);
		electrodomesticos.addAll(lavarropas);

		Collections.shuffle(electrodomesticos);

		return electrodomesticos;

	}

	public static void impresionListas(ArrayList<Heladera> heladeras, ArrayList<Cocina> cocinas,
			ArrayList<Lavarropa> lavarropas, ArrayList<Electrodomestico> electrodomesticos) {

		System.out.println(">>>> Lista de Cocinas >>>>>>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(cocinas.remove(rand.nextInt(cocinas.size())));

		}
		System.out.println("\n");

		System.out.println(">>>> Lista de Heladeras >>>>>>>");
		for (int i = 0; i < 3; i++) {

			System.out.println(heladeras.remove(rand.nextInt(heladeras.size())));

		}

		System.out.println("\n");

		System.out.println(">>>> Lista de Lavarropas >>>>>>>");

		for (int i = 0; i < 3; i++) {

			System.out.println(lavarropas.remove(rand.nextInt(lavarropas.size())));

		}
		System.out.println("\n");

		System.out.println(">>>> Lista de Recomendados >>>>>>>");

		for (int i = 0; i < 3; i++) {
			
			System.out.println(electrodomesticos.remove(rand.nextInt(electrodomesticos.size())));
			
		}
		
	}

}
