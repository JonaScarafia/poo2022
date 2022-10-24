package subject;

public class SistemaMetereologico extends Clima{
	
	private String estadoClima;

	public String getEstadoClima() {
		return estadoClima;
	}

	public void setEstadoClima(String estadoClima) {
		this.estadoClima = estadoClima;
		notificarReporteros();
	}

}
