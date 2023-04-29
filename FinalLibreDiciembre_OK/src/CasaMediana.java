
public class CasaMediana extends PlanVivienda {

	public CasaMediana(String direccion, Integer numeroVivienda) {
		super(direccion, numeroVivienda);

	}

	public void agregarPersona(Persona persona) {


		if (familia.size() < 4) {

			super.agregarPersona(persona);

		}

	}

	public String toString() {
		return super.toString()
				+ "Casa Mediana cuenta con los siguientes ambientes  3 habitaciones, un baño y un patio Frontal"
				+ ", Integrantes de familia=:";
	}

}
