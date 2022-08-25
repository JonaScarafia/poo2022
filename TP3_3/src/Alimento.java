
public class Alimento {

	private String nombre, sabor, origen;
	private Double calorias;
	
	public Alimento(String nombre, String sabor, String origen, Double calorias) {
		super();
		this.nombre = nombre;
		this.sabor = sabor;
		this.origen = origen;
		this.calorias = calorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}
	
	public String Consume() {
		
		return "Desaparece";
		
	}
	
public String noConsume() {
		
		return "Putrefacto";
		
	}
	
}
