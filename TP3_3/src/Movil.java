
public class Movil extends Telefono implements Envio{

private String pais;

	public Movil(String nombre, String marca, String modelo, int numero, String pais) {
		super(nombre, marca, modelo, numero);

		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	public String enviar() {
		
		return "Se envio un mensaje de texto";
		
	}
	
	public String recibir() {
		
		return "Se recibe el mensaje en su telefono celular ";
		
	}
	
	public String tiempo() {
		
		return "El envio del mensaje de texto tarda unos pocos minutos";
	}

}
