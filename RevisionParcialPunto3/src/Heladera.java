
public class Heladera extends Electrodomestico {

	private Integer capacidadTotal, frezzer;

	public Heladera(String modelo, String marca, String color, Integer precio, Integer capacidadTotal,
			Integer frezzer) {
		super(modelo, marca, color, precio);
		this.capacidadTotal = capacidadTotal;
		this.frezzer = frezzer;
	}

	public Integer getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(Integer capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public Integer getFrezzer() {
		return this.frezzer;
	}

	public void setFrezzer(Integer frezzer) {
		this.frezzer = frezzer;
	}

	@Override
	public String toString() {
		return super.toString() + " La capacidad Total en litros de la Heladera es: " + capacidadTotal
				+ " la capacidad del frezzer en litros es: " + frezzer;
	}

}
