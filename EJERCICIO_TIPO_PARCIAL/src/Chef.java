import java.util.Iterator;
import java.util.Random;

public class Chef implements Runnable {
	//Productor

	private Pedidos pedidos;
	
	public Chef(Pedidos pedidos) {
		
		this.pedidos = pedidos;
	}


	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			try {
				
				Thread.sleep(5000);
				
			} catch (Exception e) {
				
			}
		
			Plato plato = new Plato("plato"+i,new Random().nextInt()); //5,100
			
			//acá podría ser una excepcion de si se me cae un plato calcular probabilidad que se aurrine algo ejercicio de parcial
			this.pedidos.ingresar(plato);
			
		}
		
		this.pedidos.ingresar(null);
		
		
	}

	
	
	
}
