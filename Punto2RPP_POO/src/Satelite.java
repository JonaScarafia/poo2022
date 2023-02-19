
public class Satelite implements DispositivoElectronico {
	
	public void sacarFoto() {

		System.out.println("Saco foto desde un satelite.");

	}
	
	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde un Satelite con delay");
		}	
	}
	
}
