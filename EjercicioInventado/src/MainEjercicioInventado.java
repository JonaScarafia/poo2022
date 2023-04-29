import java.util.ArrayList;
import java.util.Random;

public class MainEjercicioInventado {

	public static void main(String[] args) {

		Random rand = new Random();

		ArrayList<TipoCaja> tiposDeCajas = new ArrayList<>();

		TipoCaja tipocaja1 = new SinAlcohol("Sin Alcohol", 9);
		TipoCaja tipocaja2 = new Gasificada("Gasificada", 6);
		TipoCaja tipocaja3 = new SinAlcohol("Alcoholica", 4);

		tiposDeCajas.add(tipocaja1);
		tiposDeCajas.add(tipocaja2);
		tiposDeCajas.add(tipocaja3);

		for (int i = 0; i < 40; i++) {

			String marcaBebida = "Nombre" + i;
			Integer precioUnidad = rand.nextInt(9801) + 200;
			Integer capacidadBotella = rand.nextInt(701) + 500;

			Bebida bebida1 = new Bebida(marcaBebida, precioUnidad, capacidadBotella);

			TipoCaja tipCaj = tiposDeCajas.get(rand.nextInt(tiposDeCajas.size()));

			tipCaj.empaquetarBebida(bebida1);

		}
		
		for  (TipoCaja tipoCaja : tiposDeCajas) {
			System.out.println(tipoCaja.toString() + "\n");
			tipoCaja.mostrarcajas();
		}
		
	}
}
