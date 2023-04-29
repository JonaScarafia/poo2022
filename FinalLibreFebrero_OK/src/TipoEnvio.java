import java.util.ArrayList;

public abstract class TipoEnvio {

	protected String tiempoEnvio;
	protected Integer precioKg;
	protected ArrayList<Paquete> listaPaquetes = new ArrayList<>();

	public TipoEnvio(String tiempoEnvio, Integer precioKg) {

		this.tiempoEnvio = tiempoEnvio;
		this.precioKg = precioKg;

	}

	public void agregarPaquete(Paquete paquete) {

		System.out.println("Se agrego paquete al tipo de envio ");
		listaPaquetes.add(paquete);

	}

	public void listarPaquetes() {

		for (Paquete paquete : listaPaquetes) {
			System.out.println(paquete.toString() + this.calcularPrecio(paquete));
		}
	}

	abstract Integer calcularPrecio(Paquete paquete);

	public String toString() {

		return "Tiempo de Envio= " + tiempoEnvio + " Dias " + ", Precio por Kg= $" + precioKg;

	}

}
