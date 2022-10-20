
public class Plato {

	private String nombre;
	private Integer precio;
	
	public Plato(String nombre, Integer precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}

	
	public String toString() {
		return this.nombre + "precio:" +this.precio;
	}
	
	
	
}
