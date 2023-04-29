
public class Persona {

	private String nοmbre;
	private String apellido;
	private Integer edad;
	private String jefeFamilia;

	public Persona(String nοmbre, String apellido, Integer edad, String jefeFamilia) {

		this.nοmbre = nοmbre;
		this.apellido = apellido;
		this.edad = edad;
		this.jefeFamilia = jefeFamilia;

	}

	public String getJefeFamilia() {
		return jefeFamilia;
	}

	public void setJefeFamilia(String jefeFamilia) {
		this.jefeFamilia = jefeFamilia;
	}

	public String toString() {
		return  nοmbre + ", apellido= " + apellido + ", "+ edad+" años " + " es jefe de Familia:"
				+ jefeFamilia;
	}
}
