
public abstract class Personaje {

	private int vida, nivelAtaque, nivelDefensa;

	public Personaje(int vida, int nivelAtaque, int nivelDefensa) {
		super();
		this.vida = vida;
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

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
	
	public int defender(int nivelAtaque) {
		
		return nivelAtaque-getNivelDefensa();
	}
	
}
