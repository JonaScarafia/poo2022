import java.time.LocalDate;

public class MainPunto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona person1 = new Persona ("Jona", "Scarafia", LocalDate.of(1992, 04, 13));
		Persona person2 = new Persona ("Jebus","Romano", LocalDate.of(1995, 12, 24));
		Persona person3 = new Persona ("Sophie","Gomez",LocalDate.of(2000, 9, 21));
		
		System.out.println(person1.toString());
		System.out.println("\n");
		System.out.println(person2.toString());
		System.out.println("\n");
		System.out.println(person3.toString());
		
		System.out.println("\n");
		
		// PERTENECIENTE AL PUNTO 8
		
		person1.calculateEdad(person1.getFechadeNacimiento(),person1.getNombre());
		person2.calculateEdad(person2.getFechadeNacimiento(),person2.getNombre());
		person3.calculateEdad(person3.getFechadeNacimiento(),person3.getNombre());
		
		/// >>> >>>>> /////
		
		//Lo podíra mejorar haciendo un arraylist y solo haría un syso para que me muestre la lista de personas.

	}

}
