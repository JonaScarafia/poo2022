
public class Cocina extends Electrodomestico {

	private boolean electrica;

	public Cocina(String modelo, String marca, String color, Integer precio, boolean electrica) {
		super(modelo, marca, color, precio);
		this.electrica = electrica;
	}

	public boolean isElectrica() {
		return electrica;
	}

	public void setElectrica(boolean electrica) {
		this.electrica = electrica;
	}

	public String toString() {
		return super.toString() + " ¿La cocina es electrica? " + electrica;
	}
}
