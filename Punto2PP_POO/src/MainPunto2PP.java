import java.util.ArrayList;
import java.util.Random;

public class MainPunto2PP {

	public static void main(String[] args) {
	

		Random rnd = new Random();
		
		ArrayList<Familia> familias = GeneroDatos.generarFamilias(rnd.nextInt(10)+1);
		GeneroDatos.impresionFamilias(familias);
	}

}
