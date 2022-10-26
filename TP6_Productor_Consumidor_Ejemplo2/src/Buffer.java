import java.util.logging.Level;
import java.util.logging.Logger;

public class Buffer {

	private char[] buffer;
	private Integer siguiente;
	private boolean estaVacia, estaLLena;

	public Buffer(Integer tamanio) {

		this.buffer = new char[tamanio];
		this.siguiente = 0;
		this.estaVacia = true;
		this.estaLLena = false;
	}
	
	public synchronized Character consumir() {
	
		while (this.estaVacia) {
			
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		siguiente --;
		this.estaLLena=false;
		
		if (siguiente ==0) {
			this.estaVacia=true;
		}
		notifyAll();
		
		return this.buffer[this.siguiente];
		
	}

	
	public synchronized void producir(char caracter) {
		
		while (this.estaLLena) {
			try {
				 wait();	
			} catch (InterruptedException e) {
			Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null,e);
			}
		}
		
		buffer[siguiente]= caracter;
		siguiente++;
		this.estaVacia=false;
		
		if (siguiente == this.buffer.length) {
			this.estaLLena=true;
		}
		
		notifyAll();
		
	}
	
}
