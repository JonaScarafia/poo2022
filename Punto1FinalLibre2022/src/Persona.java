
public class Persona {

	private String nombre;
	private String apellido;
	private Integer edad;
	private Boolean jefeHogar;
	
	public Persona(String nombre, String apellido, Integer edad, Boolean jefeHogar) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.jefeHogar = jefeHogar;
	
	}

	public Boolean getJefeHogar() {
		return jefeHogar;
	}

	public void setJefeHogar(Boolean jefeHogar) {
		this.jefeHogar = jefeHogar;
	}
	
	
		
}
