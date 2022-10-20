import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {

	private Tamagochi tamagochi;

	@Override
	public void jugar() {

	}

	@Override
	public void alimentar() {

	}

	@Override
	public void dormir() {

	}

	@Override
	public void comoEstas() {
		System.out.println("ZZZZzzzzzz...... está durmiendo! shhhhh");

	}

	@Override
	public void setTamagochi(Tamagochi tamagochi) {
		this.tamagochi=tamagochi;

		Timer timer = new Timer();//bibliteca incorporada en Java es como el Random();

		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				Durmiendo.this.tamagochi.setState(new Hambriento());/* hago durmiendo. this por que por que si hago this tamagochi va a pensar que me refiero al objeto de la clase anonima
				por que el this hace referencia a la clase mas cercana en la que esta contenida, como es anonima por eso no reconoce a tamgochi por eso se realiza Durmiendo
			.this
			*/}
		},7000); 

	}
}
