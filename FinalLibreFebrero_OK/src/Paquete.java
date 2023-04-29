
public class Paquete {

	private String nombreRemitente;
	private String direccionRemitente;
	private String direccionDestinatario;
	private Integer pesoPaquete;
	
	public Paquete(String nombreRemitente, String direccionRemitente, String direccionDestinatario,
			Integer pesoPaquete) {
	
		this.nombreRemitente = nombreRemitente;
		this.direccionRemitente = direccionRemitente;
		this.direccionDestinatario = direccionDestinatario;
		this.pesoPaquete = pesoPaquete;
	}
	
	public Integer getPesoPaquete() {
		return pesoPaquete;
	}

	public String toString() {
		return "Informacion del Paquete nombre del Remitente= " + nombreRemitente + ", Direccion del Remitente= " + direccionRemitente
				+ ", Direccion del Destinatario= " + direccionDestinatario + ", Peso del Paquete=" + pesoPaquete + " kg, " + " Precio total del envio $";
	}
	
}
