
public class Heladera extends Electrodomestico {

	private Integer capacidadTotal;
	private Integer frezzer;

	public Heladera(String modelo, Integer precio, String marca, String color, Integer capacidadTotal,
			Integer frezzer) {
		super(modelo, precio, marca, color);

		this.setCapacidadTotal(capacidadTotal);
		this.setFrezzer(frezzer);

	}

	public Integer getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(Integer capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public Integer getFrezzer() {
		return frezzer;
	}

	public void setFrezzer(Integer frezzer) {
		this.frezzer = frezzer;
	}

	@Override
	public String toString() {

		return super.toString() + " Capacidad Total en litros es: " + capacidadTotal + ", Frezzer en litros es: "
				+ frezzer;

	}

}
