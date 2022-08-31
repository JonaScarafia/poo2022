
public class MainPunto5 {

	public static void main(String[] args) {

		Combate comb = new Combate();

		Policia police1 = new Policia(450, 50, 100, 500);//vida, nivel ataque, nivel defensa, puntos vida

		Pandillero ganster1 = new Pandillero(500,500 , 30, 600);
		
		comb.figth(police1, ganster1);

	}
}


