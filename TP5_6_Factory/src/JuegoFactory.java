
public class JuegoFactory {

	public Juego createJuego(String juego) {

		if (juego.equalsIgnoreCase(("Juego Fisico").trim())) {

			return new JuegoFisico();

		}

		if (juego.equalsIgnoreCase(("Juego Digital").trim())) {

			return new JuegoDigital();

		}

		return null;
	}

}
// patron comportamiento

// hilos nos da un codigo y analizar 
// son dos ejercicios
//excepciones


// debo hacer una clase abstacta  en este caso crear juego para que herede que en este caso juego y que los juegos digital y fisico herede de ellos para que pueda utilizar el metodo abstracto
