import java.util.ArrayList;

public class Familia {

	private ArrayList<Persona> familia = new ArrayList<>();

	public Familia(ArrayList<Persona> familia) {

		this.familia = familia;
	
	};

	public void agregarPersona(Persona persona) {

		if (persona.getJefeHogar()== true) {
			System.out.println("Se agrego una persona a la familia y es Jefe de Hogar");
			familia.add(persona);
			
		}else {
			System.out.println("Se agrego una persona a la familia");
			familia.add(persona);
		}
		
	}

}
