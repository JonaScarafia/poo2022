
public class Bebida {

	private String marca;
	private Integer precioUnidad;
	private Integer capacidadBotella;

	public Bebida(String marca, Integer precioUnidad, Integer capacidadBotella) {

		this.marca = marca;
		this.precioUnidad = precioUnidad;
		this.capacidadBotella = capacidadBotella;
	}

	public Integer getCapacidadBotella() {
		return capacidadBotella;
	}

	public String toString() {

		return "Marca de la bebida " + marca + ", Precio por Unidad= $" + precioUnidad + ", Capacidad de la Botella= "
				+ capacidadBotella + " Ml";

	}

}
