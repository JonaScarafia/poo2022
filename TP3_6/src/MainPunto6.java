import java.util.ArrayList;
import java.util.Random;

public class MainPunto6 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		ArrayList<Persona> personas = new ArrayList<>();
		
		Docente teacher1 = new Docente("Fausto","Garcia","POO");//Nombre, Apellido, Materia
		//Aca utilice el metodo para aplicar polimorfismo estatico
		
		for(int i = 0; i < 10; i++) {
			if(rnd.nextBoolean()) {
				personas.add(new Docente("NomDoc"+i, "ApeDoc"+i, "Mat"+i));
				personas.add(teacher1);
		
			}else {
				Alumno alumno = new Alumno("AlumNom"+i, "AlumApe"+i);
				for(int j = 0; j < 10; j++) {
					alumno.agregarMateria("Mat"+j);
					if(rnd.nextBoolean()) {
						break;
					}
				}
				personas.add(alumno);
			}
		}

		for (Persona persona : personas) {
			System.out.println(persona.materia());
		}


	}

}
