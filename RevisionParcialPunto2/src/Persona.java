import java.util.Random;


///PUNTO 2 Parcial POO 2022 SCARAFIA JONATHAN PRACTICA PARA RECUPERATORIO

public class Persona {

	private String name;
	private Integer edad;

	public Persona(String name, Integer edad) {
		super();
		this.name = name;
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


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
	public String toString() {
		return  " La edad de la persona "+name +" es "+edad;
	}
	//HACER UN NEW EN EL FOR PARA PODER IMPRIMIR TODAS LAS PERSONAS
}
