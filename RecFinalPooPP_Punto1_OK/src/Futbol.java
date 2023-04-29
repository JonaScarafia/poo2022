
public class Futbol extends Deporte {

	public Futbol(String horario, String lugar) {
		super(horario, lugar);

	}

	void agregarDeportista(Deportista deportista) {
//el enunciado lo vi confuso y puse mayores a 15 y menores a 35
		if (deportista.getEdad() > 15 && deportista.getEdad() < 35) {

			System.out.println("El jugador se incribio a futbol");
			listaDeportistas.add(deportista);

		} else {
			System.out.println("El jugador " + deportista.toString() + " no se pudo ser inscripto a Futbol");
		}

	}

	public String toString() {
		return "Lista jugadores de futbol " + "\n" + super.toString();
	}

}
