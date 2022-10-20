
public class Aburrido implements State {

	private Tamagochi tamagochi;
	
	
	@Override
	public void jugar() {
		
		System.out.println("Jugemos por favor!!!!! ");
		tamagochi.setState(new Cansado());
		
	}

	@Override
	public void alimentar() {
	System.out.println("No quiero comer!!!!");
		
	}

	@Override
	public void dormir() {
		System.out.println("No quiero Dormir!!!!");
		
	}

	@Override
	public void comoEstas() {
		System.out.println("Estoy aburrido!!!! Quiero Jugar!!!!");
		
	}

	@Override
	public void setTamagochi(Tamagochi tamagochi) {
		this.tamagochi=tamagochi;
		
	}

}
