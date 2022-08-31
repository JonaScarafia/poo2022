
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

	public int defenseGanster(int getnivelAtaque, int getnivelDefensa, int vida) {

		System.out.println("Pandillero: Vamos ataca!!!! estoy seguro que fallaras ");

		if (getnivelDefensa < getnivelAtaque) {

			vida =this.puntosVida;

			System.out.println("INFORMACION: Has sufrido la cantidad de daño "+(getnivelAtaque - getnivelDefensa));

			puntosVida=(vida-(getnivelAtaque - getnivelDefensa));
			return getPuntosVida();

		}else {

			System.out.println("INFORMACION: Tu defensa ha sido exitosa!!! el ataque de tu enemigo fallo B) ");

		}

		return  getPuntosVida();
	}


	public int attackGanster(int getnivelAtaque) {

		System.out.println("Pandillero: Te hare conocer a San Pedro!!!! ");

		getnivelAtaque = getnivelAtaque*2;

		return getnivelAtaque;

	}
}
