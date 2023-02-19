
public class Telefono implements DispositivoElectronico {

	public void sacarFoto() {

		System.out.println("Saco foto desde un celular.");

	}
	
	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde un Telefono con delay");
		}	
	}
	
}
