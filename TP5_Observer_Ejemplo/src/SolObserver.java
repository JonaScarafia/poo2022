
public class SolObserver extends Observer {

	private Double valorCambio = 3.98;
	
	
	public SolObserver (Subject observable) {
		this.observable=observable;
		this.observable.agregar(this);
		
	}

	@Override
	public void actualizar() {
		System.out.println("Sol Peruano: " + (observable.getEstado()*valorCambio));
		
	}
	
}
