import java.util.LinkedList;

public class Cientifico extends Thread {

	private Servidor servidor;
	public LinkedList<PaqueteDatos> colaPaquetes=new LinkedList<PaqueteDatos>();
	
	public Cientifico(Servidor servidor) {
		
		this.servidor = servidor;
	}
	
	private void promediar(String nombreBoya, String tipoDato) {
		// condicion de fin cantidad de boyas tenemos que dejar de esperar o consumir cosas en este caso por el null
		
		Double suma=0.0;
		Double total=0.0;
		Double promedio=0.0;
		
		for (PaqueteDatos paqueteDatos : colaPaquetes) {
			if(paqueteDatos.getNombreBoya().equals(nombreBoya)) {
			if (tipoDato.equals("temperatura")) {
				
				suma=suma+ paqueteDatos.getTemperatura();
				
			}else {
				suma = suma +paqueteDatos.getVelocidadViento();
				
			}
			total++;
		}
			promedio=suma/total;
		}
		System.out.println("El promedio de "+tipoDato+" para la boya "+nombreBoya+" es: "+promedio);
	}
	

	
	public void run() {
		
		Integer contador=0;
		
		while(contador <2) {
			
			PaqueteDatos paquete = this.getServidor().consultar();
			if (paquete !=null) {
				contador++;
			}else {
				this.getColaPaquetes().add(paquete);
			}
		}
		
		System.out.println("\n INFORMES PROMEDIO");
		this.promediar("CIDMAR-1", "temperatura");
		this.promediar("CIDMAR-1", "velocidad de viento");
		this.promediar("CIDMAR-2", "temperatura");
		this.promediar("CIDMAR-2", "velocidad de viento");
		
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public LinkedList<PaqueteDatos> getColaPaquetes() {
		return colaPaquetes;
	}

	public void setColaPaquetes(LinkedList<PaqueteDatos> colaPaquetes) {
		this.colaPaquetes = colaPaquetes;
	}

	
}
