import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainFinalLibreDiciembre {

	public static void main(String[] args) {

		Random rand = new Random();
		
		ArrayList<String> jefes = new ArrayList<>(Arrays.asList("SI", "NO"));

		ArrayList<PlanVivienda> tiposCasa = new ArrayList<>();

		for (int i = 0; i < 50; i++) {

			String direccion = "CalleFalsaABC" + i;
			Integer numeroVivienda = rand.nextInt(1000) + 1;

			Integer tipoCasa = rand.nextInt(3) + 1;

			switch (tipoCasa) {

			case 1: {

				PlanVivienda casa1 = new CasaPequeña(direccion, numeroVivienda);

				tiposCasa.add(casa1);
				break;
			}

			case 2: {

				PlanVivienda casa1 = new CasaMediana(direccion, numeroVivienda);
				tiposCasa.add(casa1);
				break;
			}

			case 3: {
				PlanVivienda casa1 = new CasaGrande(direccion, numeroVivienda);
				tiposCasa.add(casa1);
				break;
			}

			}

		}

		for (int j = 0; j < 500; j++) {

			String nombre = "NombreA" + j;
			String apellido = "ApellidoB" + j;
			Integer edad = rand.nextInt(100) + 1;
			String jefeFamilia = jefes.get(rand.nextInt(jefes.size()));

			Persona persona1 = new Persona(nombre, apellido, edad, jefeFamilia);

			PlanVivienda house = tiposCasa.get(rand.nextInt(tiposCasa.size()));

			house.agregarPersona(persona1);

		}

		for (PlanVivienda house : tiposCasa) {

			System.out.println(house.toString() + "\n");
			house.mostrarfamilia();

		}

	}
}
