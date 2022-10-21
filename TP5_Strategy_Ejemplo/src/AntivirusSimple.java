
public class AntivirusSimple extends AnalisisSimple{

	
	void iniciar() {
	System.out.println(" Antivirus Simple - Analissi simple iniciado ");
		
	}

	
	void saltarZip() {
	try {
		
		System.out.println("Analizando el sistema ");
		Thread.sleep(2500);
		System.out.println("No se pudo analizar archivos con extensiones 'zip' ");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	}

	
	void detener() {
	System.out.println("Antivirus Simple - Analisis Simple Finalizado");	
		
	}

}
