
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

	public int defensePolice(int getnivelAtaque) {

		System.out.println("No podras atravesar mi chaleco antibalas escoria!!!! ");

		if (getNivelDefensa() < getnivelAtaque) {

			puntosVida = puntosVida-getnivelAtaque;

			System.out.println("Has sufrido la cantidad de daño "+ puntosVida);

			return puntosVida;


		}else {

			System.out.println(" Tu defensa ha sido exitosa!!! el ataque de tu enemigo fallo ");

		}


		return  getPuntosVida();

	}
	
	
	public int statusPolice(int vida, int puntosvida) {
		
	vida=vida-puntosvida;	
		
		System.out.println("Luego de la batalla tu vida es de " + vida);
	
		return vida;
	}
	
}
