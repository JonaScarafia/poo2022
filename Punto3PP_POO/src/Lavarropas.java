
public class Lavarropas extends Electrodomestico {

	private Boolean cargaFrontal;
	private Integer capacidad;

	public Lavarropas(String modelo, Integer precio, String marca, String color, Boolean cargaFrontal,
			Integer capacidad) {
		super(modelo, precio, marca, color);

		this.setCargaFrontal(cargaFrontal);
		this.setCapacidad(capacidad);

	}

	public Boolean getCargaFrontal() {
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
		return super.toString() + ", Carga Frontal= "  + cargaFrontal + ", La capacidad es " + capacidad + "kg";
	}

}
