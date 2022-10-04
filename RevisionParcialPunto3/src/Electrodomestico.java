
public class Electrodomestico {

	private String modelo, marca, color;
	private Integer precio;
	// private ArrayList<Electrodomestico> listElectrodomesticos;

	public Electrodomestico(String modelo, String marca, String color, Integer precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		// this.listElectrodomesticos = listElectrodomesticos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	/*
	 * 
	 * public ArrayList<Electrodomestico> getListElectrodomesticos() { return
	 * listElectrodomesticos; }
	 * 
	 * public void setListElectrodomesticos(ArrayList<Electrodomestico>
	 * listElectrodomesticos) { this.listElectrodomesticos = listElectrodomesticos;
	 * }
	 * 
	 */

	public String toString() {
		return " Modelo= " + modelo + ", Marca= " + marca + ", Color= " + color + ", Precio= $" + precio;
	}
}
