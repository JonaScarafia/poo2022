
public class Electrodomestico { // debería ser abstracta ya que nunca voy a querer instanciar obra sino sus clases derivadas.

	private String modelo, marca, color; // deberían ser protected 
	private Integer precio;
	

	public Electrodomestico(String modelo, String marca, String color, Integer precio) {
		//super(); Esta clase no extiende especificamente de una clase nuestra, no tiene sentido hacer uso de super
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
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

	public String toString() {
		return " Modelo= " + modelo + ", Marca= " + marca + ", Color= " + color + ", Precio= $" + precio;
	}
}
