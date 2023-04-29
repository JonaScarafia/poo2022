import java.util.ArrayList;

public class Gasificada extends TipoCaja {

	public Gasificada(String tipoBebida, Integer limiteAcopio) {
		super(tipoBebida, limiteAcopio);

	}

	public ArrayList<Bebida> empaquetarBebida(Bebida bebida) {

		if (bebida.getCapacidadBotella() > 750 && bebida.getCapacidadBotella() <= 950) {

			System.out.println("La Bebida Gasificada se ingreso a la caja Correctamente XD!!!");
			cajaBebidas.add(bebida);
			chequeoCantidadCaja(cajaBebidas);

		} else {
			System.out.println("La Bebida Gasificada sobrepasa la capacidad standard");
		}
		return cajaBebidas;
	}

	void chequeoCantidadCaja(ArrayList<Bebida> cajaBebidas) {

		if (cajaBebidas.size() < 2) {

			Integer numBotellas = cajaBebidas.size();

			System.out.println("Puede continuar agregando a la caja, llevan " + numBotellas
					+ " Botellas de bebida Gasificada" + "\n");

		}

		else {
			System.out.println("La caja de bebidas Gasificadas esta llena!");
			super.guardoCajas(cajaBebidas);
			super.creoCaja();
		}
	}

}
