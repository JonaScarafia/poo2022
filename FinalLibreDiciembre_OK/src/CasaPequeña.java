
public class CasaPeque�a extends PlanVivienda {

	public CasaPeque�a(String direccion, Integer numeroVivienda) {
		super(direccion, numeroVivienda);

	}

	public void agregarPersona(Persona persona) {


		if (familia.size() < 3) {

			super.agregarPersona(persona);

		}
	}

	public String toString() {

		return super.toString()
				+ "Casa Peque�a cuenta con los siguientes ambientes  2 habitaciones, un ba�o y un patio Frontal"
				+ ", Integrantes de familia:";

	}
}
