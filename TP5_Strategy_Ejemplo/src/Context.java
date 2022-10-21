
public class Context {

	private Strategy patronStrategy;
	
	public Context(Strategy patronStrategy) {
		this.patronStrategy=patronStrategy;
	}
	
	public void ejecutar () {
		this.patronStrategy.analizar();
		
	}
	
}
