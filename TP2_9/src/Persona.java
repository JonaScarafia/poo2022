
public class Persona {

	private String nombre;
	private Genero sexo;
	private String ocupacion;

	public Persona(String nombre, Genero sexo, String ocupacion) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Genero getSexo() {
		return sexo;
	}

	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String informationPerson() {

		return "Nombre: "+ nombre +" Sexo: " + sexo + " ocupación "+ ocupacion; 
	}


}


