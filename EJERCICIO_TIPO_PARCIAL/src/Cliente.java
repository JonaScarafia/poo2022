
public class Cliente extends Thread {
	//Consumidor
	
	private Pedidos pedidos;
	
	public Cliente(Pedidos pedidos) {
		this.pedidos = pedidos;
		
	}
	
	public void run() {
	
		Integer contador = 0;
		while (contador <3){
		Plato plato = this.pedidos.servir();
		
		if(plato == null) {
			contador++;
		}
		}
		
	}

	
	
}
