
public class PesoARGObserver extends Observer {

	private Double valorCambio=291.00;
	
	public PesoARGObserver(Subject observable) {
		this.observable=observable;
		this.observable.agregar(this);
	}
	
	
	public void actualizar() {
	
		System.out.println("Peso Argentino: " +(observable.getEstado()*valorCambio));
		
	}	
}
