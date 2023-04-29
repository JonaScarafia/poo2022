
public class CasaPequeña extends PlanVivienda {

	public CasaPequeña(String direccion, Integer numeroVivienda) {
		super(direccion, numeroVivienda);

	}

	public void agregarPersona(Persona persona) {


		if (familia.size() < 3) {

			super.agregarPersona(persona);

		}
	}

	public String toString() {

		return super.toString()
				+ "Casa Pequeña cuenta con los siguientes ambientes  2 habitaciones, un baño y un patio Frontal"
				+ ", Integrantes de familia:";

	}
}
