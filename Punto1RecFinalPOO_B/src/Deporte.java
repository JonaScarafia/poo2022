import java.util.ArrayList;

public abstract class Deporte {

	protected String nombreDeporte;
	protected String horario;
	protected String lugar;
	protected ArrayList<Deportista> deportistas = new ArrayList<>();

	public Deporte(String nombreDeporte, String horario, String lugar, ArrayList<Deportista> deportistas) {

		this.nombreDeporte = nombreDeporte;
		this.horario = horario;
		this.lugar = lugar;
		this.deportistas = deportistas;
	}

	abstract ArrayList<Deportista> inscribirDeportista(Deportista deportista);

	//abstract ArrayList<Deporte> mostrarLista(ArrayList<Deportista> deportista);
	
	public void mostrarLista(Deporte deporte) {
		
		for (Deportista deportista : deportistas) {
			
			System.out.println(deportista.toString());
			
		}	
		System.out.println("\n");
	}
	
	public String toString() {
		return "Listado de Jugadores de "+nombreDeporte + "\n"+ "Horario "+horario+ " - " + "Lugar:" + lugar;
	}
}
