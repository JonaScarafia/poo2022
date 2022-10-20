
public class Cansado implements State {
	
	private Tamagochi tamagochi;

	@Override
	public void jugar() {
		
		System.out.println("No quiero Jugar!!! estoy cansado!!!!! ");
		
		
	}

	@Override
	public void alimentar() {
	System.out.println("No quiero comer!!!!");
		
	}

	@Override
	public void dormir() {
		System.out.println("Buenas Noches Mundo!!!!");
		tamagochi.setState(new Durmiendo());
		
	}

	@Override
	public void comoEstas() {
		System.out.println("Estoy cansado!!! Tengo sueño!!!!");
		
	}

	@Override
	public void setTamagochi(Tamagochi tamagochi) {
		this.tamagochi=tamagochi;
		
	}
}
