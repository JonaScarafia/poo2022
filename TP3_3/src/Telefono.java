public class Telefono {

	private String nombre, marca, modelo;
	private int numero;

	
	public Telefono(String nombre, String marca, String modelo, int numero) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumero() {
		return numero;
		
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

//	@Override
//	public String toString() {
//		return "Telefono [nombre=" + getNombre() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", numero=" + getNumero() + "]";
//	}

	

}