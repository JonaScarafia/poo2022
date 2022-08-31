
public abstract class Personaje {

	private int vida, nivelAtaque, nivelDefensa;

	//private ArrayList<Personaje> personajes;

	public Personaje(int vida, int nivelAtaque, int nivelDefensa) {
		super();
		this.vida = vida;
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
	}

	public int getVida() {
		return vida;
	}
	//
	//	public int setVida(int vida) {
	//		this.vida = vida;
	//	}

	public int getNivelAtaque() {
		return nivelAtaque;
	}

	public void setNivelAtaque(int nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}

	public int getNivelDefensa() {
		return nivelDefensa;
	}

	public void setNivelDefensa(int nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}


	public int atacar(int nivelAtaque){

		System.out.println("Estoy atacando!!! sufriras!!! ");

		return nivelAtaque*5;
	}

	public int defender() {

		return nivelAtaque-nivelDefensa;
	}

	public int statusLife(int puntosVida) {
		this.vida=puntosVida;
	
		if (vida<=0) {
			try {
				throw new LifeException("INFORMACION: La vida no puede ser negativa ");
			} catch (Exception e) {
				System.out.println(e.getMessage());

				this.vida=0;
			}

			System.out.println("INFORMACION: Luego de la batalla tu vida es de " + vida +" no puedes seguir luchando, Moriste X.X T.T ");
		}	
		if(vida>0) {
			
			System.out.println("INFORMACION: Sobreviviste a la batalla! tu condición es " + vida + " puedes seguir luchando! Buena Suerte! ");	
		}
		
		return vida;
	}

}


