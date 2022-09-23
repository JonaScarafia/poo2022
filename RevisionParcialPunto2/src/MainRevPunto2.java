import java.util.ArrayList;
import java.util.Random;

///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class MainRevPunto2 {
	
	public static void main(String[] args) {

		Random rndGen = new Random();
		Random rndPer = new Random();


		Integer numFamily= rndGen.nextInt(10)+1;
		System.out.println("El numero de Familia que se creara sera de: "+numFamily+"\n");

		for (int i = 0; i < numFamily; i++) {

			Familia family1 = new Familia(null, new ArrayList<Persona>());	
			family1.GenerationSurname();

			Integer numPer;
			numPer=rndPer.nextInt(5)+1;
			System.out.println("La cantidad de integrantes que va a tener la familia "
					+ family1.getApellido()+" va a ser de "+ numPer);
			System.out.println("\n");

			for(int j = 0; j <numPer; j++) {

				Persona person1 = new Persona(null,null);
				person1.generationName();
				person1.generationAge();

				family1.agregarIntegrante(person1);
				//family1.mostrarIntegrantes(family1.getApellido());
				//family1.calculateProm(family1.getIntegrantes());

				//no me funcionaba por que mostraba en cada iteracion y eso me provocaba el mal funcionamiento

			}

			family1.mostrarIntegrantes(family1.getApellido());
			family1.calculateProm(family1.getIntegrantes());

		}
	}
}
