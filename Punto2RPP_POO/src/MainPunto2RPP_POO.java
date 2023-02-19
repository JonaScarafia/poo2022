import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MainPunto2RPP_POO {

	public static void main(String[] args) {

		/*
		 * Punto A
		 * 
		 * ¿Como podría abstraer el comportamiento de sacar fotos de las clases para que
		 * en main se pueda programar pensando en objetos que pueden sacar fotos?
		 * 
		 * 
		 * Se podría abstraer el comportamiento utilizando una interface donde estaría
		 * el metodo sacar foto() y cada clase la utilizaria.
		 * 
		 */

		/*
		 * Punto B ¿Como agregaría polomorfismo estatico al metodo sacarFoto si ahora
		 * tambien es posible añadir un delay al momento de la captura? Ejemplifique con
		 * una clase
		 * 
		 * 
		 * Le agregaria polimorfismo estatico utilizando un metodo sobrecargado para que
		 * el programador decida con que dispositivo desea sacar la foto
		 * 
		 */

		ArrayList<DispositivoElectronico> listaDispositivos = new ArrayList<>();
		Random ran = new Random();

		for (int i = 0; i < 3; i++) {

			DispositivoElectronico telefono = new Telefono();
			listaDispositivos.add(telefono);

		}

		for (int i = 0; i < 3; i++) {

			DispositivoElectronico satelite = new Satelite();
			listaDispositivos.add(satelite);

		}

		for (int i = 0; i < 3; i++) {

			DispositivoElectronico camaraSeg = new CamaraSeguridad();
			listaDispositivos.add(camaraSeg);

		}

		for (DispositivoElectronico dispositivos : listaDispositivos) {

			dispositivos.sacarFoto();

		}
		System.out.println("\n");
		
		for (DispositivoElectronico dispositivos : listaDispositivos) {
			
			dispositivos.sacarFoto(ran.nextBoolean());
			//dispositivos.sacarFoto(true);
		}
	}
}
