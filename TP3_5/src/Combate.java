
import java.util.Random;

public class Combate {


	public void figth (Policia police1, Pandillero ganster1) {
		//	
		Random rand = new Random();

		while (police1.getPuntosVida()>0 && ganster1.getPuntosVida()>0) {
			if (rand.nextBoolean()) {

				police1.defensePolice(ganster1.attackGanster(ganster1.getNivelAtaque()) , police1.getNivelDefensa(), police1.getVida());
				police1.statusLife(police1.getPuntosVida());
				System.out.println("\n");
			}
			else {
				ganster1.defenseGanster(police1.attackPolice( police1.getNivelAtaque()), ganster1.getNivelDefensa(), ganster1.getVida());
				ganster1.statusLife(ganster1.getPuntosVida());
				System.out.println("\n");
			}
		}
	}	
}
