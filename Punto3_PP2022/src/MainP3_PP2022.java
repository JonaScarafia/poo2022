import java.util.ArrayList;

public class MainP3_PP2022 {

	public static void main(String[] args) {

		ArrayList<Heladera> heladeras = GeneracionDatos.generarListaHeladeras(10);
		ArrayList<Cocina> cocinas = GeneracionDatos.generarListaCocinas(10);
		ArrayList<Lavarropa> lavarropas = GeneracionDatos.generarListaLavarropas(10);
		ArrayList<Electrodomestico> electromesticos = GeneracionDatos.generarListaElectrodomesticos(heladeras, cocinas,
				lavarropas);

		GeneracionDatos.impresionListas(heladeras, cocinas, lavarropas, electromesticos);
	}

}