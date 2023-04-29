
public class Avion extends TipoEnvio {

	public Avion(String tiempoEnvio, Integer precioKg) {
		super(tiempoEnvio, precioKg);

	}

	public void agregarPaquete(Paquete paquete) {

		if (paquete.getPesoPaquete() <= 20) {

			System.out.println("Se agrego paquete al tipo de envio Avion exitosamente ");
			listaPaquetes.add(paquete);

		} else {
			System.out.println("El paquete es demasiado pesado Para el Avion!!! Lo sentimos!!! :'/ ");
		}

	}

	Integer calcularPrecio(Paquete paquete) {
		Integer precioEnvio =0 ;

		precioEnvio= paquete.getPesoPaquete()*2500;
		
		return precioEnvio;
	}

	public String toString() {
		return "El tipo de envio es Avion y su " + super.toString();
	}

}
