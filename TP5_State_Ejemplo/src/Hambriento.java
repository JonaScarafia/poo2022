
public class Hambriento implements State {

	private Tamagochi tamagochi;

	@Override
	public void jugar() {
		
		System.out.println("No quiero Jugar!!! Quiero comer!!!!! ");
		
		
	}

	@Override
	public void alimentar() {
	System.out.println("ÑOM ÑOM!!!! Felicitaciones al Chef");
	tamagochi.setState(new Aburrido());
	}

	@Override
	public void dormir() {
		System.out.println("No quiero Dormir Loco!!!!");
		
		
	}

	@Override
	public void comoEstas() {
		System.out.println("Tengo hambre!!!! Dame Comida!!!!");
		
	}

	@Override
	public void setTamagochi(Tamagochi tamagochi) {
		this.tamagochi=tamagochi;
		
	}
}
