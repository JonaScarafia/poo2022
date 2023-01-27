import java.util.Random;

public class MainPP2019_Practica {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println("Buscando Red mas estable...");
		for (int j = 0; j < 3; j++) {
			
		//	Computadora computadora = new Computadora("Computadora"+j,);	
		
		}
		
		
		Cableada cableada = new Cableada();

		cableada.generarIp();
		
		Wifi wifi = new Wifi();
		
		wifi.generarIp();
		
		Telefonica tel = new Telefonica();
		tel.generarIp();
	}

}
