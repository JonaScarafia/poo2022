
public class PaqueteDatos {

	private String nombreBoya;
	private Double temperatura;
	private Double velocidadViento;
	private long tiempo;

	public PaqueteDatos(String nombreBoya, Double temperatura, Double velocidadViento, long tiempo) {
		
		this.nombreBoya = nombreBoya;
		this.temperatura = temperatura;
		this.velocidadViento = velocidadViento;
		this.tiempo = tiempo;
	}

	public String getNombreBoya() {
		return nombreBoya;
	}

	public void setNombreBoya(String nombreBoya) {
		this.nombreBoya = nombreBoya;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Double getVelocidadViento() {
		return velocidadViento;
	}

	public void setVelocidadViento(Double velocidadViento) {
		this.velocidadViento = velocidadViento;
	}

	public long getTiempo() {
		return tiempo;
	}

	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	public String toString() {
		return "PaqueteDatos [nombreBoya=" + nombreBoya + ", temperatura=" + temperatura + ", velocidadViento="
				+ velocidadViento + ", tiempo=" + tiempo + "]";
	}

}
