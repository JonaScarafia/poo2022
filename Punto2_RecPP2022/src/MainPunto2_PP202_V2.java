
public class MainPunto2_PP202_V2 {

	/*
	 * Punto A
	 * 
	 * �Como podr�a abstraer el comportamiento de sacar fotos de las clases para que
	 * en main se pueda programar pensando en objetos que pueden sacar fotos?
	 * 
	 * Se podr�a utilizar una interface donde estar�a 
	 * el metodo sacar foto  y cada clase  la utilizar�a con sus respectiva caracteristica de cada
	 * dispositivoElectronico.
	 * 
	 * 
	 * Punto B �C�mo agregar�a polimorfismo est�tico al m�todo sacarFoto si ahora
	 * tambi�n es posible a�adir un delay al momento de la captura? Ejemplifique con
	 * una clase.
	 * 
	 * Le agregar�a polimorfismo estatico con un metodo sobrecargado para que a la
	 * hora de utilizarlo el programador decida de que manera desea sacar la foto
	 * 
	 * 
	 * Comentario de Pablo
	  
	  1- el delay es tiempo, quiz�s un integer sea m�s �til.
      2- en el Main el polimorfismo al utilizar la interfaz no s� aplica si no haces que las instancias sean vistas como la interfaz.
      Osea.. TelefonoV2 telefono1 = new TelefonoV2 no.  DispositivoElectronicoV2 telefono1 = new TelefonoV2 si.
	   Y un bucle para hacer tantas instancias tambi�n ser�a �til
	 
	 *
	 */
	
	

	public static void main(String[] args) {

		TelefonoV2 telefono1 = new TelefonoV2();
		TelefonoV2 telefono2 = new TelefonoV2();
		TelefonoV2 telefono3 = new TelefonoV2();

		SateliteV2 satelite1 = new SateliteV2();
		SateliteV2 satelite2 = new SateliteV2();
		SateliteV2 satelite3 = new SateliteV2();

		CamaraSeguridadV2 camara1 = new CamaraSeguridadV2();
		CamaraSeguridadV2 camara2 = new CamaraSeguridadV2();
		CamaraSeguridadV2 camara3 = new CamaraSeguridadV2();

		telefono1.sacarFoto();

		// PUNTO B
		telefono1.sacarFoto(true);

		telefono2.sacarFoto();
		telefono3.sacarFoto();
		System.out.println("\n");
		
		satelite1.sacarFoto();
		// PUNTO B
		satelite1.sacarFoto(true);
		satelite2.sacarFoto();
		satelite3.sacarFoto();
		System.out.println("\n");
		
		camara1.sacarFoto();
		// PUNTO B
		camara1.sacarFoto(true);
		camara2.sacarFoto();
		camara3.sacarFoto();

	}

}
