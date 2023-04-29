
public class Deportista {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;
	private String sexo;
	
	public Deportista(String nombre, String apellido, Integer dni, Integer edad, String sexo) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
	
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public String toString() {
	
		return nombre + ", " + apellido + ", DNI: " + dni + ", edad=" + edad + ", Sexo= "
				+ sexo;
	}
	
}
