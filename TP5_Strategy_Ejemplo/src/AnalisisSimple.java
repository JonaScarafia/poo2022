
public abstract class AnalisisSimple implements Strategy {


	public void analizar() {
		
		iniciar();
		saltarZip();
		detener();
		
	}
	
	abstract void iniciar();
	abstract void saltarZip();
	abstract void detener();
}
