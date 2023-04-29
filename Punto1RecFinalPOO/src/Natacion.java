import java.util.ArrayList;

public class Natacion extends Deporte{
	
	private String horario;
	private String lugar;
	private ArrayList<Jugador> nadadores = new ArrayList<>();
	
	public Natacion(String nombreDeporte, ArrayList<Jugador> jugadores, String horario, String lugar) {
		super(nombreDeporte);
		
		this.horario = horario;
		this.lugar = lugar;
	}
	
	public void inscribirJugador(Jugador jugador) {

		if (jugador.getEdad()>18 && jugador.getSexo() == "Masculino") {

			nadadores.add(jugador);

		} else {
			
			System.out.println("El Jugador no se puede inscribir a Natacion");
			//rechazados.add(jugador);
			
		}
		
	}
	
	public void mostrarLista(ArrayList<Jugador> jugadores) {

		
		for (Jugador jugador : jugadores) {

			 System.out.println(jugador.toString());
		}
		
	}
	

//	public void mostrarListaRechazados(ArrayList<Jugador> jugadores) {
//
//		for (Jugador jugador : rechazados) {
//
//			System.out.println(jugador.toString() + " no pudo ser anotado");
//			
//		}
//	}

}
