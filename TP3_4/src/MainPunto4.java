
public class MainPunto4 {

	public static void main(String[] args) {

		
		Policia police1 = new Policia(450, 50, 100, 500);
		Pandillero ganster1 = new Pandillero(500, 60, 30, 600);
		
		police1.defensePolice(ganster1.atacar(ganster1.getNivelAtaque()));
		System.out.println("\n");
		ganster1.defenseGanster(police1.atacar(police1.getNivelAtaque()));
		police1.statusPolice(police1.getVida(), police1.getPuntosVida());
	}

}
