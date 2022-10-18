
public class JuegoDigital implements Juego {

	private Integer id;
	private Double importe, precioPlataforma;

	public JuegoDigital() {

		this.id = 7894;
		this.importe = 300.00;
		this.precioPlataforma = 200.00;
	}

	public void crearJuego() {

		System.out.println("Se creó Juego Digital");

	}

	public void eliminarJuego() {
		System.out.println("Se eliminó Juego Digital"+ "\n");

	}

	public String toString() {
		return "Juego Digital identificación " + id + ", importe $" + importe + ", precio Plataforma $"
				+ precioPlataforma + "!!!";
	}

}
