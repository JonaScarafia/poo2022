import java.util.ArrayList;

public abstract class Deporte {

	protected String nombreDeporte;
	

	public Deporte(String nombreDeporte) {

		this.nombreDeporte = nombreDeporte;
	
	}

	public String getNombreDeporte() {
		return nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}

	public void inscribirJugador(Jugador jugador) {
//si me queda vacio deberia ser abstracto
	}
	
//	public void mostrarLista(ArrayList<Jugador> jugadores) {
//		
//	}
	
	public void mostrarListaRechazados(ArrayList<Jugador> jugadores) {
		//deberia ir la lista
	}

	@Override
	public String toString() {
		return "Listado de jugadores de nombreDeporte= " + nombreDeporte;
	}

}
