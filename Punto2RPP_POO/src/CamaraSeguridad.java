
public class CamaraSeguridad implements DispositivoElectronico {

	public void sacarFoto() {

		System.out.println("Saco foto desde una camara de seguridad.");

	}
	
	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde un camara de seguridad con delay");
		}	
	}

}
