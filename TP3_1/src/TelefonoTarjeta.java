
public class TelefonoTarjeta extends Telefono {

	private Double incrementoPorRecargar, montoRecarga;
	private Integer recargas;

	public TelefonoTarjeta(String nombre, String marca, String modelo, int numero, double saldo,Double incrementoPorRecargar, Double montoRecarga,Integer recargas) {
		super(nombre, marca, modelo, numero);

		this.incrementoPorRecargar = incrementoPorRecargar;
		this.recargas = recargas;
		this.montoRecarga= montoRecarga;
	}



	public Double getIncrementoPorRecargar() {
		return incrementoPorRecargar;
	}

	public void setIncrementoPorRecargar(Double incrementoPorRecargar) {
		this.incrementoPorRecargar = incrementoPorRecargar;
	}

	public Integer getRecargas() {
		return recargas;
	}

	public void setRecargas(Integer recargas) {
		this.recargas = recargas;
	}


	public Double getMontoRecarga() {
		return montoRecarga;
	}

	public void setMontoRecarga(Double montoRecarga) {
		this.montoRecarga = montoRecarga;
	}


	public Double gastos() {

		if (getRecargas() <=2) {

			return getMontoRecarga();

		}else {

			return getRecargas()*getIncrementoPorRecargar();			
		}

	}

	public String toString() {
		return "Telefono utilizado con Tarjeta " + super.toString() + "\n gastos mensuales: $ " + getRecargas() + " Incremento por recargas:" + getIncrementoPorRecargar();
			
	}




}
