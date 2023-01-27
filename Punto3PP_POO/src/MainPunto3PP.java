import java.util.ArrayList;

public class MainPunto3PP {

	public static void main(String[] args) {
		
		ArrayList<Heladera> heladeras = GeneroDatosP3.generoListaHeladeras(10);
		ArrayList<Cocina> cocinas = GeneroDatosP3.generoListaCocinas(10);
		ArrayList<Lavarropas> lavarropas = GeneroDatosP3.generoListaLavarropas(10);
		ArrayList<Electrodomestico> electrodomesticos = GeneroDatosP3.generoListaRecomendados(heladeras,cocinas,lavarropas);
	
		
		GeneroDatosP3.impresionListas(heladeras, cocinas, lavarropas, electrodomesticos);
	
	}

}
