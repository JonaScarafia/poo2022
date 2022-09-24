import java.util.ArrayList;
import java.util.Random;

///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class MainRevPunto2 {
	
	public static void main(String[] args) {
		/* ¿Por qué dos clases Random?
		 * Aunque se vayan a usar para diferentes fines puede utilizarse la misma!
		 *  por otro lado, no abreviar nombres de variables
		 *  es preferible que sean largos pero entendibles
		 *  que tratar de entender para que sirven luego leyendo el codigo
		 *  una variable deberia de tener un nombre que ya indique lo que posee		 *  
		 *  */
		Random rndGen = new Random();
		Random rndPer = new Random();

		/* lo mismo, nombres de variables claros. */
		Integer numFamily= rndGen.nextInt(10)+1;
										/* familias */
		System.out.println("El numero de Familia que se creara sera de: "+numFamily+"\n");

		for (int i = 0; i < numFamily; i++) {
			/* en cada vuelta del for esta variable(familiy1) se sobre escribe
			 * no es mejor llamarla family y ya
			 *  ¿tiene sentido sumarle un 1 al final?
			 *  que al constructor
			 *  
			 *  yendo al new Familia, no tienen sentido los parametros
			 *  si vas a pasar el primero en null y el segundo un array list vacio
			 *  no es mas facil dejarle a Familia un constructor por defecto que no reciba parametros
			 *  y que la clase se encargue de inicializar personas como un array list ?
			 *  Familia family = new Familia(); en este caso quedaria mejor
			 *  */
			Familia family1 = new Familia(null, new ArrayList<Persona>());	
			/* como ya venimos diciendo, evitemos que la clase se encargue de generar sus propios datos
			 * se entiende que la idea es simular datos, pero podemos simularlos acá y pasarle ya el apellido como parametro
			 * una familia no deberia de definir su propio apellido
			 *  */
			family1.GenerationSurname();

			Integer numPer;
			numPer=rndPer.nextInt(5)+1;
			System.out.println("La cantidad de integrantes que va a tener la familia "
					+ family1.getApellido()+" va a ser de "+ numPer);
			System.out.println("\n");

			for(int j = 0; j <numPer; j++) {
				/*
				 * idem person1 podria ser person
				 * si no vas a pasar parametros entonces no definas constructor que espere parametros
				 * Persona person = new Persona(); y listo!
				 * */
				Persona person1 = new Persona(null,null);
				/* evitemos que la persona genere su pripio name y edad */
				person1.generationName();
				person1.generationAge();

				/*
				 * Un ejemplo de como pudo ser esto
				 * teniendo una clase helper con metodos estaticos
				 * String nombre = TuClaseHelper.generarNombrePersona();
				 * Integer edad = TuClaseHelper.generarEdadPersona();
				 * Persona persona = new Persona(nombre, edad);
				 * familia.agregarIntregante(persona);
				 * 
				 * o que tu clase HelperDirectamente genere la persona
				 * llevandote todo este codigo que puse mas arriba a un metodo
				 * luego hacias 
				 * familia.agregarIntegrante(TuClaseHelper.generarPersona());
				 * 
				 * */
				
				
				// ok!
				family1.agregarIntegrante(person1);
					
				//family1.mostrarIntegrantes(family1.getApellido());
				//family1.calculateProm(family1.getIntegrantes());

				//no me funcionaba por que mostraba en cada iteracion y eso me provocaba el mal funcionamiento
				
				/* tiene sentido, estas dentro del for de familia pero a su vez
				 * estas dentro del for que crea personas, por cada persona que estas agregando
				 * se van a ejecutar esas lineas de mostrar integrantes
				 * en todo caso lo tenias que hacer dentro del primer for pero fuera del segundo
				*/
			}
			// esto!
			family1.mostrarIntegrantes(family1.getApellido());
			family1.calculateProm(family1.getIntegrantes());
			
			
			/*
			 * resumen, me gusta
			 * lograste el objetivo
			 * mas alla de las correciones que te dejo es un muy buen punto de partida
			 * es cuestion de practicar y ser prolijo
			 * y claro, aprender de y evitar malas practicas
			 * */
		}
	}
}
