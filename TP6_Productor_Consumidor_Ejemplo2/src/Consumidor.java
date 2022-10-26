import java.util.Random;

public class Consumidor extends Thread {

	private Buffer buffer;

	public Consumidor(Buffer bufer) {
		this.buffer = bufer;
	}

	public void run() {

		while (true) {
			try {
				Character caracter = this.buffer.consumir();
				System.out.println("Recogido el caracter " + caracter + " del buffer");

				Random rand = new Random();
				// lo mando a dormir entre 0 y 5  segundos
				Integer tiempoSleep = (rand.nextInt(6)) * 1000;
				sleep(tiempoSleep);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
