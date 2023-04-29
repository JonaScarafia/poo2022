
public class Terrestre extends TipoEnvio {

	public Terrestre(String tiempoEnvio, Integer precioKg) {
		super(tiempoEnvio, precioKg);

	}

	public void agregarPaquete(Paquete paquete) {

		if (paquete.getPesoPaquete() <= 100) {

			System.out.println("Se agrego paquete al tipo de envio Terrestre exitosamente ");
			listaPaquetes.add(paquete);

		} else {
			System.out.println("El paquete es demasiado pesado para el tipo Terrestre!!! Lo sentimos!!! :'/ ");
		}

	}

	Integer calcularPrecio(Paquete paquete) {
		Integer precioEnvio = 0;

		precioEnvio = paquete.getPesoPaquete() *1000 ;

		return precioEnvio;
	}

	public String toString() {

		return "El tipo de envio es Terrestre y su " + super.toString();

	}

}
