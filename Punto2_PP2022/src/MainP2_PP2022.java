import java.util.ArrayList;
import java.util.Random;

public class MainP2_PP2022 {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<Familia> familias = GeneracionDatos.generarFamilias(rand.nextInt(10) + 1);

		GeneracionDatos.impresionFamilias(familias);

	}

}
