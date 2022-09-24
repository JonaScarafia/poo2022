import java.util.Random;


///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class Persona {

	/* ok!*/
	private String name;
	private Integer edad;

	/* el constructor esta ok, una pena que no lo hayas usado pasando directo los valores en lugar de null :(  */
	public Persona(String name, Integer edad) {
		super(); // innecesario
		this.name = name;
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

/* ya remarcado, evitemos que las clases generen sus propios datos de prueba
 * en un entorno real esto no puede pasar
 * evitemos tomar la mala practica
 *  */
	public void generationAge() {

		Random rndAge = new Random();

		this.edad = rndAge.nextInt(99-0+1)+0;
	}


	public void generationName() {

		String[] names = new String[20];

		for (int i = 0; i < names.length; i++) {
			names[i]="Name"+i;
		}
		Random rndName = new Random();

		Integer nam = rndName.nextInt(20);// atencion con esto del tema del indice

		this.name = names[nam] ;
	}


	@Override
	/* tenés un metodo toString
	 * es preferible que luego al imprimir lo llames explicitamente
	 * System.out.print(persona.toString());
	 * en lugar de
	 * System.out.print(persona);
	 * es mucho mas claro
	 *  */
	public String toString() {
		return  " La edad de la persona "+name +" es "+edad;
	}
	/* no dejes comentarios que no aportan nada
	 * el código entra primero por los ojos ;)
	 * entre mas claro y prolijo mejor para quien te lee
	 * sea una evaluación o un code review en un ambiente laboral
	 * consejo para tu carrera
	 *  */
	//HACER UN NEW EN EL FOR PARA PODER IMPRIMIR TODAS LAS PERSONAS
}
