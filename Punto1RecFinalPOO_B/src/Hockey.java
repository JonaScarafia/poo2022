import java.util.ArrayList;

public class Hockey extends Deporte {

	public Hockey(String nombreDeporte, String horario, String lugar, ArrayList<Deportista> deportistas) {

		super(nombreDeporte, horario, lugar, deportistas);

	}

	ArrayList<Deportista> inscribirDeportista(Deportista deportista) {

		if (deportista.getSexo().equals("Femenino")) {

			deportistas.add(deportista);

		} else {

			System.out.println("El Jugador "+ deportista.toString()+ " no se puede inscribir a " + nombreDeporte);
			//System.out.println("\n");

		}
		
		return deportistas;

	}
}
