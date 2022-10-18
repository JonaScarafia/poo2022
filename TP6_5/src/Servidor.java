import java.util.LinkedList;

public class Servidor {

	private LinkedList<PaqueteDatos> colaPaquetes = new LinkedList<PaqueteDatos>();
	
	public synchronized void almacenar(PaqueteDatos unPaquete) {
		
		while(colaPaquetes.size()>=3) {
			
			try {
				
				wait();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (unPaquete != null) {
			
			System.out.println("ALMACENO: "+ unPaquete.toString());
			
		}
		colaPaquetes.add(unPaquete);
		notifyAll();
		
	}
	
	public synchronized PaqueteDatos consultar() {
		
		
		while(colaPaquetes.isEmpty()) {
			try {
				
				wait();
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		PaqueteDatos unPaquete = colaPaquetes.removeFirst();
		
		if (unPaquete != null) {
			System.out.println("CONSULTO: "+unPaquete.toString());
		}
		notifyAll();
		return unPaquete;
	}
	
}
