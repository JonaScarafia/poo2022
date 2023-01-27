
public class MainPunto2_PP202_V2 {

	/*
	 * Punto A
	 * 
	 * ¿Como podría abstraer el comportamiento de sacar fotos de las clases para que
	 * en main se pueda programar pensando en objetos que pueden sacar fotos?
	 * 
	 * Se podría utilizar una interface donde estaría 
	 * el metodo sacar foto  y cada clase  la utilizaría con sus respectiva caracteristica de cada
	 * dispositivoElectronico.
	 * 
	 * 
	 * Punto B ¿Cómo agregaría polimorfismo estático al método sacarFoto si ahora
	 * también es posible añadir un delay al momento de la captura? Ejemplifique con
	 * una clase.
	 * 
	 * Le agregaría polimorfismo estatico con un metodo sobrecargado para que a la
	 * hora de utilizarlo el programador decida de que manera desea sacar la foto
	 * 
	 * 
	 * Comentario de Pablo
	  
	  1- el delay es tiempo, quizás un integer sea más útil.
      2- en el Main el polimorfismo al utilizar la interfaz no sé aplica si no haces que las instancias sean vistas como la interfaz.
      Osea.. TelefonoV2 telefono1 = new TelefonoV2 no.  DispositivoElectronicoV2 telefono1 = new TelefonoV2 si.
	   Y un bucle para hacer tantas instancias también sería útil
	 
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
