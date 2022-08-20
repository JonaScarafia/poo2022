import java.time.LocalDate;

public class Persona {
	
	private String nombre, apellido;
	private LocalDate fechadeNacimiento;
	
	
	public Persona(String nombre, String apellido, LocalDate fechadeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadeNacimiento = fechadeNacimiento;
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


	public LocalDate getFechadeNacimiento() {
		return fechadeNacimiento;
	}


	public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
		this.fechadeNacimiento = fechadeNacimiento;
	}
	
	


	@Override
	public String toString() {
		return "Nombre de Persona: " + nombre + " \n Apellido: " + apellido + " \n Fecha de Nacimiento: " + fechadeNacimiento
				+ " B)";
	}
	
	
	
	

}
