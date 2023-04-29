
public class Maritimo extends TipoEnvio {

	public Maritimo(String tiempoEnvio, Integer precioKg) {
		super(tiempoEnvio, precioKg);

	}

	Integer calcularPrecio(Paquete paquete) {
		Integer precioEnvio = 0;

		precioEnvio = paquete.getPesoPaquete() * 500;

		return precioEnvio;
	}

	public String toString() {
		return "El tipo de envio es Maritimo y su "+ super.toString();
	}

}
