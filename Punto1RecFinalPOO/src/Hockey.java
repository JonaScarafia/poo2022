import java.util.ArrayList;

public class Hockey extends Deporte {

	private String horario;
	private String lugar;
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	
	
	public Hockey(String nombreDeporte, ArrayList<Jugador> jugadores, String horario, String lugar) {
		super(nombreDeporte);
	
		this.horario = horario;
		this.lugar = lugar;
	}
	
	public void inscribirJugador(Jugador jugador) {

		if (jugador.getSexo() == "Femenino") {

			jugadores.add(jugador);

		} else {
			//rechazados.add(jugador);
			System.out.println("El Jugador no se puede inscribir a hockey");

		}
		
	}
	
	public void mostrarLista(ArrayList<Jugador> jugadores) {

		for (Jugador jugador : jugadores) {

			System.out.println(jugador.toString());
		}
	}

//	public void mostrarListaRechazados(ArrayList<Jugador> rechazados) {
//
//		for (Jugador jugador : rechazados) {
//
//			System.out.println(jugador.toString() + " no pudo ser anotado");
//		}
//	}
	
}
