
public class PesoMXObserver extends Observer {

	private Double valorCambio = 19.93;

	public PesoMXObserver(Subject observable) {
		this.observable = observable;
		this.observable.agregar(this);

	}

	@Override
	public void actualizar() {
		System.out.println("Peso Mexicano: " + (observable.getEstado()*valorCambio));
	}

}
