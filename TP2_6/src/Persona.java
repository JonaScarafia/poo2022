import java.time.LocalDate;
import java.time.Period;

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
	
// PERTENECIENTE AL PUNTO 8
	
	public void calculateEdad(LocalDate fechadeNacimiento, String nombre) {
		
		LocalDate f1 = fechadeNacimiento;
		LocalDate f2 = LocalDate.now();
		 
		Period period = Period.between(f1, f2);
		 
		System.out.println("La edad de "+nombre +" es: " + period.getYears());
		
	}
	
	
	public String toString() {
		return "Nombre de Persona: " + nombre + " \n Apellido: " + apellido + " \n Fecha de Nacimiento: " + fechadeNacimiento
				+ " XD";
	}
	
	
	
	
	
	

}
