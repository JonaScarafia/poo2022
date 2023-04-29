import java.util.ArrayList;

public class Futbol extends Deporte {

	public Futbol(String nombreDeporte, String horario, String lugar, ArrayList<Deportista> deportistas) {
		super(nombreDeporte, horario, lugar, deportistas);

	}

	ArrayList<Deportista> inscribirDeportista(Deportista deportista) {

		if (deportista.getEdad() > 15 && deportista.getEdad() < 35 && deportista.getSexo().equals("Masculino")) {

			deportistas.add(deportista);

		}

		else {

			System.out.println("El Jugador " + deportista.toString() + " no se anoto a " + nombreDeporte);
			//System.out.println("\n");
		}
		return deportistas;
	}	
}
