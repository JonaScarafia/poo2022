
public class Jugador {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer edad;
	private String sexo;

	public Jugador(String nombre, String apellido, Integer dni, Integer edad, String sexo) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
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
		return "Los datos del Jugador son"+ "\n" +"Nombre "+ nombre + ", apellido= " + apellido + ", DNI= " + dni + ", Edad= " + edad +" Años"+ ", Sexo= "
				+ sexo + "]";
	}
	
	

}
