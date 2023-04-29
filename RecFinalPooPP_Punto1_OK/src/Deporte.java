import java.util.ArrayList;

public abstract class Deporte {

	protected ArrayList<Deportista> listaDeportistas = new ArrayList<>();
	protected String horario;
	protected String lugar;

	public Deporte(String horario, String lugar) {

		this.horario = horario;
		this.lugar = lugar;

	}

	abstract void agregarDeportista(Deportista deportista);

	public void mostrarDeportistas() {

		for (Deportista deportista : listaDeportistas) {
			System.out.println(deportista.toString());
		}
	}

	public String toString() {
		return "Horario=" + horario + ", lugar=" + lugar;
	}

}
