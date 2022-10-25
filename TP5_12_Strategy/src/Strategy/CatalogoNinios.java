package Strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CatalogoNinios implements CatalogoStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	private Map<String, String> peliculas = new HashMap<String, String>();

	public CatalogoNinios() {

		peliculas.put("Sherk"," Ni�os");
		peliculas.put("Cenicienta"," Ni�os");
		peliculas.put( "Blancanieves"," Ni�os");
		peliculas.put("Pixies"," Ni�os ");
	}



	public void mostrarCatalogo() {
		
		System.out.println("La lista de peliculas infantiles son: \n");
		for (Entry<String, String> String : peliculas.entrySet()) {

			System.out.println(String.getKey() +" Categor�a "+ String.getValue());

		}
	}

}
