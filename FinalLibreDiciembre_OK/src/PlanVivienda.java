import java.util.ArrayList;

abstract class PlanVivienda {

	protected String direccion;
	protected Integer numeroVivienda;
	protected ArrayList<Persona> familia = new ArrayList<>();
	protected Integer contador;

	public PlanVivienda(String direccion, Integer numeroVivienda) {

		this.direccion = direccion;
		this.numeroVivienda = numeroVivienda;
		this.contador = 0;

	}

	public Boolean cantJefes() {
		
		if (contador < 2) {
			return true;
		} else {
			return false;
		}
	}

	public void agregarPersona(Persona persona) {
		if (cantJefes() && persona.getJefeFamilia().equals("SI")) {
			familia.add(persona);
			contador++;
			System.out.println("Se agrego una persona a la familia y es jefe de familia");
		}else if (persona.getJefeFamilia().equals("NO")) {
			familia.add(persona);
			System.out.println("Se agrego una persona a la familia");
		} 
			
	};

//	public Boolean esJefeFamilia(Persona persona) {
//
//		Boolean jefe = false;
//
//		if (persona.getJefeFamilia().equals("SI")) {
//
//			jefe = true;
//			
//		}
//		
//		return jefe;
//	}

	public void mostrarfamilia() {
		
		for (Persona persona : familia) {
			System.out.println(persona.toString());
		}

	}

	public String toString() {
		return "\n " + " Direccion=" + direccion + ", numeroVivienda=" + numeroVivienda
				+ " Informacion General de la casa " + "\n";
	}
}
