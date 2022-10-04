import java.util.ArrayList;

public class MainRevPunto3 {

	public static void main(String[] args) {

		ArrayList<Cocina> cocinas = GeneracionDatos.generarListaCocinas(10);
		ArrayList<Heladera> heladeras = GeneracionDatos.generarListaHeladeras(10);
		ArrayList<Lavarropa> lavarropas = GeneracionDatos.generarListaLavarropas(10);
		ArrayList<Electrodomestico> electrodomesticos = GeneracionDatos.generarListaElectrodomesticos(cocinas,
				heladeras, lavarropas);

		GeneracionDatos.impresionListas(cocinas, heladeras, lavarropas, electrodomesticos);
	}

}
