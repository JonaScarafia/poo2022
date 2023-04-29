import java.util.ArrayList;

public class Natacion extends Deporte {

	public Natacion(String nombreDeporte, String horario, String lugar, ArrayList<Deportista> deportistas) {

		super(nombreDeporte, horario, lugar, deportistas);

	}

	ArrayList<Deportista> inscribirDeportista(Deportista deportista) {

		if (deportista.getEdad() > 18 && deportista.getSexo().equals("Masculino")) {

			deportistas.add(deportista);

		} else {

			System.out.println("El Nadador " + deportista.toString()+ " no se puede inscribir a " + nombreDeporte);
			//System.out.println("\n");
		}

		return deportistas;
	}
}
