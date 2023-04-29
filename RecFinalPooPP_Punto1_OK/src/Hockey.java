
public class Hockey extends Deporte{

	public Hockey(String horario, String lugar) {
		super(horario, lugar);
		
	}


	void agregarDeportista(Deportista deportista) {

		if ( deportista.getSexo().equals("Femenino")) {

			System.out.println("El jugador se incribio a Hockey");
			listaDeportistas.add(deportista);
		} else {
			
			System.out.println("El jugador " + deportista.toString() + " no se pudo ser inscripto a Hockey");
		
		}
	}
	
	public String toString() {
		return "Lista Jugadores de Hockey "+"\n" + super.toString();
	}
	
	
	
}
