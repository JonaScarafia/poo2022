import java.util.Random;

public class Productor extends Thread {

	private Buffer buffer;
	private final String letras = "abcdefghijklmnopqrstuvwyz";

	public Productor(Buffer bufer) {
		this.buffer = bufer;
	}

	public void run() {

		while (true) {
			try {
				Character caracter = letras.charAt((int) (Math.random() * letras.length()));// genero una letra
																							// aleatoria yy lo casteo
				buffer.producir(caracter);

				System.out.println("Despositado el caracter " + caracter + " del buffer");
				
				Random rand = new Random();
				//lo mando a dormir entre 0 y 5 segundos
				Integer tiempoSleep = (rand.nextInt(6)) * 1000;
				sleep(tiempoSleep);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}

	}

}
