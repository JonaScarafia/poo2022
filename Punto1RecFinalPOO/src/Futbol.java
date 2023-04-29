import java.util.ArrayList;

public class Futbol extends Deporte {

	private String horario;
	private String lugar;
	private ArrayList<Jugador> jugadores = new ArrayList<>();

	public Futbol(String nombreDeporte, ArrayList<Jugador> jugadores, String horario, String lugar) {
		super(nombreDeporte);

		this.horario = horario;
		this.lugar = lugar;

	}

	public void inscribirJugador(Jugador jugador) {

		if (jugador.getEdad() < 15  && jugador.getEdad() > 35 && (jugador.getSexo() == "Masculino")) {

			jugadores.add(jugador);

		} else {
			System.out.println("no se anoto");
			//rechazados.add(jugador);

		}
	}

	public void mostrarLista() {

		for (Jugador jugador : jugadores) {

			System.out.println(jugador.toString());
		}
	}

//	public void mostrarListaRechazados() {
//		System.out.println("\n");
//		for (Jugador jugador : rechazados) {
//
//			System.out.println(jugador.toString() + " no pudo ser anotado");
//		}
//	}
}
