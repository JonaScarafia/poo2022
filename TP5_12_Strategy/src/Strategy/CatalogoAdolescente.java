package Strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CatalogoAdolescente implements CatalogoStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	private Map<String, String> peliculas = new HashMap<String, String>();

	public CatalogoAdolescente() {

		peliculas.put( "Avatar", " Ciencia Ficcion ");
		peliculas.put( "El camino hacia el dorado"," Aventura");
		peliculas.put("La odisea de los Giles"," Aventura ");
		peliculas.put("La huerfana"," Suspenso");
		peliculas.put( "Star War"," Ciencia Ficcion ");
	}

	public void mostrarCatalogo() {

		System.out.println("La lista de peliculas son: \n");
		for (Entry<String, String> String : peliculas.entrySet()) {

			System.out.println(String.getKey() +" Categoría "+ String.getValue());

		}
	}

}
