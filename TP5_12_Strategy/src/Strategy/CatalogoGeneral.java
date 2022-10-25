package Strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CatalogoGeneral implements CatalogoStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	private Map<String, String> peliculas = new HashMap<String, String>();

	public CatalogoGeneral() {

		peliculas.put( "Duro de matar 3","Accion ");
		peliculas.put("Diario de una Pasion","Romantica");
		peliculas.put("La odisea de los Giles","Aventura ");
		peliculas.put( "La huerfana","Suspenso ");
		peliculas.put("Pixies"," Niños");
	}

	public void mostrarCatalogo() {

		System.out.println("La lista de peliculas son: \n");

		for (Entry<String, String> String : peliculas.entrySet()) {

			System.out.println(String.getKey() +" Categoría "+ String.getValue());

		}
	}

}
