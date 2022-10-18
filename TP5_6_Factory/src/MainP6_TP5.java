
public class MainP6_TP5 {

	/*
	 * 
	 * Aplique el patron Factory Method para la creacion de juegos fisicos y
	 * digitales Los juegos comparten un id y un importe. Tambien el metodo
	 * abstracto getPrecio, que se Encarga de calcular el precio de uno u otro. Para
	 * ello los juegos fisicos tienen un atributo que es el precio de traslado (a
	 * caso de ejemplo elija usted) Y los juegos digitales el precio depende de la
	 * plataforma en la cual se compra teniendo como atributo el precio de la
	 * plataforma Estos valores deben ser double y multiplicarlos al importe.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		JuegoFactory fabrica = new JuegoFactory();

		Juego j1 = fabrica.createJuego("Juego fisico");
		j1.crearJuego();
		System.out.println(j1.toString());
		j1.eliminarJuego();
		
		Juego j2 = fabrica.createJuego("Juego Digital");
		j2.crearJuego();
		System.out.println(j2.toString());
		j2.eliminarJuego();

	}

}
