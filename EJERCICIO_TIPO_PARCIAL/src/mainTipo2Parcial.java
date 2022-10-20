
public class mainTipo2Parcial {

	public static void main(String[] args) {
	
		Pedidos pedidos = new Pedidos();
		
		new Thread (new Chef(pedidos)).start();// por que esta en runneable se utiliza interface
		new Thread (new Chef(pedidos)).start();
		new Thread (new Chef(pedidos)).start();
		
		
		new Cliente(pedidos).start();//extiende de hilo
		

	}

}
