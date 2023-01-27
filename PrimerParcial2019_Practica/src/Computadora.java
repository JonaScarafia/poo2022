import java.util.Random;

public class Computadora {

	private String nombre;
	private Boolean conectado;
	private Red red;
	
	Random rand = new Random();
	
	public Computadora(String nombre, Red red) {
	
		this.nombre = nombre;
		setConectado(rand.nextBoolean());
		this.red=red;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getConectado() {
		return conectado;
	}

	public void setConectado(Boolean conectado) {
		this.conectado = conectado;
	}

	public Red getRed() {
		return red;
	}

	public void setRed(Red red) {
		this.red = red;
	}
	
	
	public void enviarMensaje(String mensaje, String ip) {
		
	//	mensaje = mensaje + "para: "+red.obtenerComputadora(ip).getNombre()+"desde " + nombre;
		
		
	}
	
	public void RecibirMensaje() {
		
	}
	

}
