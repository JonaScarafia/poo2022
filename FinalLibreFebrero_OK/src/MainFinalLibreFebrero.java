import java.util.ArrayList;

import java.util.Random;

public class MainFinalLibreFebrero {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<TipoEnvio> listaTipoEnvios = new ArrayList<>();
		

		TipoEnvio tipo1 = new Avion("1", 2500);
		TipoEnvio tipo2 = new Terrestre("3", 1000);
		TipoEnvio tipo3 = new Maritimo("7", 500);

		listaTipoEnvios.add(tipo1);
		listaTipoEnvios.add(tipo2);
		listaTipoEnvios.add(tipo3);
		
		for (int i = 0; i < 20 ; i++) {
			
			String nombreRemi = "NombreVerdadero"+i;
			String direccionRemi = "CalleVerdadera"+i;
			String direccionDestino = "CalleFalsa"+i;
			Integer pesoPaquete = rand.nextInt(2500)+1;
			
			Paquete paquete1 = new Paquete(nombreRemi, direccionRemi, direccionDestino, pesoPaquete);
			
			TipoEnvio tipoEnvi;
			
			tipoEnvi = listaTipoEnvios.get(rand.nextInt(listaTipoEnvios.size()));
			
			tipoEnvi.agregarPaquete(paquete1);
			
		}
		
		for (TipoEnvio tipoEnvio : listaTipoEnvios) {
			System.out.println(tipoEnvio.toString()+ "\n");
			tipoEnvio.listarPaquetes();
		}
	}
}
