

public class Lavarropa extends Electrodomestico {

	private boolean cargaFrontal;
	private Integer capacidad;

	public Lavarropa(String modelo, String marca, String color, Integer precio, boolean cargaFrontal,
			Integer capacidad) {
		super(modelo, marca, color, precio);
		this.cargaFrontal = cargaFrontal;
		this.capacidad = capacidad;
	}

	public boolean isCargaFrontal() {
		return cargaFrontal;
	}

	public void setCargaFrontal(boolean cargaFrontal) {
		this.cargaFrontal = cargaFrontal;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String toString() {
		return super.toString() + " ¿El Lavarropa es carga Frontal? " + cargaFrontal
				+ ", la capacidad total en kilogramos es: " + capacidad;
	}
}
