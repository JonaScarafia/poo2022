import java.util.Random;

public class Boya extends Thread {

	private String nombre;
	private Servidor servidor;
	private Termometro termometro;
	private Anemometro anemometro;

	public Boya(String nombre, Servidor servidor) {

		this.nombre = nombre;
		this.servidor = servidor;
		this.termometro = new Termometro();// Inicializar 
		this.anemometro = new Anemometro();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public Termometro getTermometro() {
		return termometro;
	}

	public void setTermometro(Termometro termometro) {
		this.termometro = termometro;
	}

	public Anemometro getAnemometro() {
		return anemometro;
	}

	public void setAnemometro(Anemometro anemometro) {
		this.anemometro = anemometro;
	}

	private void enviar(PaqueteDatos paquete) throws ExcepcionEnvio {
		try {

			Thread.sleep(5000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		if (new Random().nextInt(101) < 40) {

			throw new ExcepcionEnvio();

		}
		this.getServidor().almacenar(paquete);

	}

	private PaqueteDatos generarPaquete() {
		return new PaqueteDatos(this.getNombre(), this.getTermometro().sensar(), this.getAnemometro().sensar(),
				System.currentTimeMillis());
	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				this.enviar(this.generarPaquete());
			} catch (ExcepcionEnvio e) {
				System.out.println(
						"ERROR: " + this.getNombre() + " Hubo una falla en la comunicación, se perdio el paquete");
			}
		}
		this.getServidor().almacenar(null);

	}

}
