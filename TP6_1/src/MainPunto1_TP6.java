
public class MainPunto1_TP6 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			
		
			
		//HiloExtendiendo hiloEjemplo = new HiloExtendiendo(i);	
		//hiloEjemplo.start();
		
		
		HiloImplementando hiloEjemploRunnable = new HiloImplementando(i);
		Thread thread = new Thread(hiloEjemploRunnable);
		thread.start();
		
		}
		
		/*
		  
		  Esto esta bien o esta mal! es una pregunta que me debo hacer! para debuggear
		  y darme cuenta si esta bien lo que me esta imprimiendo no me asegura que se
		  ejecute secuencialmente por que es lo que quiero que se hagan muchas cosas a
		  la vez principio de multiprocesamiento
		  
		 */
	}

}
