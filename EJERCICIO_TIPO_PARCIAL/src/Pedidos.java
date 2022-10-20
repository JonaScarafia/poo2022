import java.util.LinkedList;

public class Pedidos {
//sería mi buffer que es un conjunto de elementos compartidos
	// se produce en imultaneo no nunca llegaria a su capacidad maxima o quizás si puede pasar 
	
	private LinkedList<Plato> platos = new LinkedList<>(); // No olvidar inicializar la lista!!! 
	
	
	
	
	public synchronized void ingresar(Plato plato) {
		
		while (this.platos.size()>3) {
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.platos.add(plato);
		notifyAll();
	}
	
	public synchronized Plato servir() {
		
		while (this.platos.isEmpty()) {
			try {
				wait();
			} catch (Exception e) {
				
			}
		}
		Plato plato = platos.removeFirst();
		
		return plato; 
				
		
	}

	
}
