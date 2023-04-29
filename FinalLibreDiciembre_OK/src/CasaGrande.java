
public class CasaGrande extends PlanVivienda {
	
	
	public CasaGrande(String direccion, Integer numeroVivienda) {
		super(direccion, numeroVivienda);
		
	}

	public void agregarPersona(Persona persona) {
	
		if (familia.size() < 6) {

			super.agregarPersona(persona);

		}
	}

	public String toString() {
		return super.toString()
				+ "Casa Grande cuenta con los siguientes ambientes  4 habitaciones, 2 baño y un patio Frontal y un patio trasero"
				+ ", Integrantes de familia: ";
	}

}
