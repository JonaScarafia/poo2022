
public class Pizza extends Alimento implements Envio{
	
	private String tipo,tamanio,local;

	public Pizza(String nombre, String sabor, String origen, Double calorias, String tipo, String tamanio,
			String local) {
		super(nombre, sabor, origen, calorias);
		
		this.tipo = tipo;
		this.tamanio = tamanio;
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public String enviar () {
		return "La pizza se envia por Delivery";
	}
	
	public String recibir () {
		
		return "Se recibio la Pizza caliente";
	}
	
	public String tiempo() {
		
		return "El tiempo de entrega dependera del trafico de ese momento";
	}

}
