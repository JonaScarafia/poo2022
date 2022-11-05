
public class Lavarropa extends Electrodomestico {

	private Boolean cargaFrontal;
	private Integer capacidad;

	public Lavarropa(String modelo, Integer precio, String marca, String color, Boolean cargaFrontal,
			Integer capacidad) {
		super(modelo, precio, marca, color);

		this.setCargaFrontal(cargaFrontal);
		this.setCapacidad(capacidad);
	}

	public boolean isCargaFrontal() {
		return cargaFrontal;
	}

	public void setCargaFrontal(Boolean cargaFrontal) {
		this.cargaFrontal = cargaFrontal;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String toString() {
		return super.toString() + " Es cargaFrontal? " + cargaFrontal + ", Capacidad en Kilogramos es: " + capacidad;
	}

}
