
public class Pandillero extends Personaje {

	private int puntosVida=500;

	public Pandillero(int vida, int nivelAtaque, int nivelDefensa, int puntosVida) {
		super(vida, nivelAtaque, nivelDefensa);

		this.puntosVida = puntosVida;
	}

	public int getPuntosVida() {
		return puntosVida;
	}
//
//	public void setPuntosVida(int puntosVida) {
//		this.puntosVida = puntosVida;
//	}

	public int defenseGanster(int getnivelAtaque) {

		System.out.println("Vamos ataca!!!! estoy seguro que fallaras ");

		if (getNivelDefensa() < getnivelAtaque) {

			puntosVida = puntosVida-getnivelAtaque;

			System.out.println("Has sufrido la cantidad de daño "+ puntosVida);

			return puntosVida;


		}else {

			System.out.println(" Tu defensa ha sido exitosa!!! el ataque de tu enemigo fallo ");

		}


		return  getPuntosVida();

	}


	public int attackGanster(int getnivelAtaque) {

		System.out.println(" Te hare conocer a San Pedro!!!! ");

		getnivelAtaque = getnivelAtaque*2;

		return  puntosVida-getnivelAtaque;

	}

}
