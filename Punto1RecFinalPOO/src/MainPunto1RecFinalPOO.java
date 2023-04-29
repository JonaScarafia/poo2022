import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainPunto1RecFinalPOO {

	public static void main(String[] args) {
		Random ran = new Random();

		ArrayList<String> sexos = new ArrayList<>(Arrays.asList("Masculino", "Femenino"));
		ArrayList<Jugador> socios = new ArrayList<>();
		
		ArrayList<Futbol> listaFutbol=new ArrayList<>();
		ArrayList<Hockey> listaHockey=new ArrayList<>();
		ArrayList<Natacion> listaNatacion=new ArrayList<>();
		
		//ArrayList<ArrayList<Deporte>> deportes = new ArrayList<>(Arrays.asList(listaFutbol,listaHockey,listaNatacion));

		for (int i = 0; i < 90; i++) {

			String nombre = "nombre" + i;
			String apellido = "Apellido" + i;
			Integer dni = 1000000 + i;
			Integer edad = ran.nextInt(99) + 1;
			String sexo = sexos.get(ran.nextInt(sexos.size()));

			Jugador jugador = new Jugador(nombre, apellido, dni, edad, sexo);

			socios.add(jugador);

		}

		
		Futbol futbol = new Futbol("Futbol", socios, "14 hs", "Gimnasio Municipal");
		Deporte hockey = new Hockey("Hockey", socios, "18hs", "Cancha Campus Universitario");
		Deporte natacion = new Natacion("Natacion", socios, "06hs", "Club Ing. Luis A. Huergo");
	
		for (Jugador jugador : socios) {

			futbol.inscribirJugador(jugador);
			//hockey.inscribirJugador(jugador);
			//natacion.inscribirJugador(jugador);

		}
		futbol.mostrarLista();
		//futbol.mostrarListaRechazados();
		//hockey.mostrarLista(jugadores);
		//natacion.mostrarLista(jugadores);

	}

}
