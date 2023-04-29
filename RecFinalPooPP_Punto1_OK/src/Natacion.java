
public class Natacion extends Deporte {

	public Natacion(String horario, String lugar) {
		super(horario, lugar);

	}

	void agregarDeportista(Deportista deportista) {
		
		if ( deportista.getEdad() > 18 && deportista.getSexo().equals("Masculino")) {

			System.out.println("El jugador se incribio a Natacion");
			listaDeportistas.add(deportista);

		} else {
			System.out.println("El jugador " + deportista.toString() + " no se pudo inscribir a Natacion");
		}

	}

	public String toString() {
		return "Lista Nadadores de Natacion " + "\n" + super.toString();
	}

}
