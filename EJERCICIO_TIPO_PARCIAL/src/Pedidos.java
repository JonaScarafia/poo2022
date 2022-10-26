import java.util.LinkedList;

public class Pedidos {
//sería mi buffer que es un conjunto de elementos compartidos
	// se produce en imultaneo no nunca llegaria a su capacidad maxima o quizás si puede pasar 
	
	private LinkedList<Plato> platos = new LinkedList<>(); // No olvidar inicializar la lista!!! 
	
	
	
	
	public synchronized void ingresar(Plato plato) {
		
		while (this.platos.size()>3) {
			try {
				
				wait();
				System.out.println("EL mozo no puede llevar mas de tres platos");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.platos.add(plato);
		System.out.println("El plato ya esta listo!!! ");
		notifyAll();
	}
	
	public synchronized Plato servir() {
		
		while (this.platos.isEmpty()) {
			try {
				System.out.println("No se puede servir todavía! los platos no están listos!!! ");
				wait();
			} catch (Exception e) {
				System.out.println("Error en el try");
			}
		}
		System.out.println("Se sirve plato al cliente!!! Buen Provecho! \n");
		Plato plato = platos.removeFirst();
		
		return plato; 
				
		
	}

	
}
