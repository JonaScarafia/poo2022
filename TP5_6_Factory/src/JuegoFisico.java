
public class JuegoFisico implements Juego {

	private Integer id;
	private Double importe, precioTraslado,precioTotal;

	public JuegoFisico() {

		this.id = 1234;
		this.importe = 500.00;
		this.precioTraslado = 200.00;
		this.precioTotal= precioTraslado*importe;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public void crearJuego() {
		System.out.println("Se creó Juego fisico");

	}
	

	public void eliminarJuego() {

		System.out.println("Se eliminó Juego fisico"+ "\n");

	}

	public String toString() {
		return "Juego Fisico identificación " + this.id + ", importe $" + this.importe + ", precio Traslado $" + this.precioTraslado
				+" precio total en $ "+precioTotal+ "!!!";
	}

	// tambien comparte un metodo abstracto de get precio

}
