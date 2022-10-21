
public class MainEjemplo_Observer {

	public static void main(String[] args) {
		
		Subject observable = new Subject();
		
		new SolObserver(observable);
		new PesoMXObserver(observable);
		new PesoARGObserver(observable);
		
		System.out.println("Si desea cambiar 100 dólares obtendra: $");
		observable.setEstado(100);
		System.out.println("\n");
		System.out.println("Si desea cambiar 1000 dólares obtendra: $");
		observable.setEstado(1000);
	}

}
