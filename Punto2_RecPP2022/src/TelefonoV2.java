
public class TelefonoV2 implements DispositivoElectronicoV2 {

	public void sacarFoto() {
		System.out.println("Saco foto desde un Telefono Celular");

	}

	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde un Telefono Celular con delay");
		}	
	}
	
}
