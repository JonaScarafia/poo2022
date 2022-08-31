
public class Policia extends Personaje{

	private int puntosVida=450;

	public Policia(int vida, int nivelAtaque, int nivelDefensa, int puntosVida) {
		super(vida, nivelAtaque, nivelDefensa);

		this.puntosVida = puntosVida;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}


	public int defensePolice(int getnivelAtaque, int getNivelDefensa, int vida) {// consultar por el tema de los nombres de los atributos

		System.out.println("Policia: No podras atravesar mi chaleco antibalas escoria!!!! ");

		if (getNivelDefensa < getnivelAtaque) {

			this.puntosVida = this.puntosVida-(getnivelAtaque - getNivelDefensa);

			System.out.println("INFORMACION: Has sufrido la cantidad de daño "+ puntosVida);


			return vida= puntosVida;


		}else {

			System.out.println("INFORMACION: Tu defensa ha sido exitosa!!! el ataque de tu enemigo falló!!! B)");

		}

		return  getPuntosVida();

	}

	public int attackPolice(int getnivelAtaque) {

		System.out.println("Policia: Hoy haré Justicia!!!! ;) ");

		getnivelAtaque = getnivelAtaque*2;

		return getnivelAtaque;

	}

}
