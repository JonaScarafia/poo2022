
public class CamaraSeguridadV2 implements DispositivoElectronicoV2 {

	public void sacarFoto() {

		System.out.println("Se Saco foto desde una Camara de Seguridad");

	}

	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde una camara de seguridad con delay");
		}
	}

}
