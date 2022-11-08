
public class SateliteV2 implements DispositivoElectronicoV2 {

	public void sacarFoto() {
		
		System.out.println("Saco foto desde un satelite");
	}
	
	public void sacarFoto(Boolean delay) {
		if (delay) {
			System.out.println("Saco foto desde un Satelite con delay");
		}	
	}

}
