
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
