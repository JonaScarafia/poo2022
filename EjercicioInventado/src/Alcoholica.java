import java.util.ArrayList;

public class Alcoholica extends TipoCaja {

	public Alcoholica(String tipoBebida, Integer limiteAcopio) {
		super(tipoBebida, limiteAcopio);

	}

	public ArrayList<Bebida> empaquetarBebida(Bebida bebida) {

		if (bebida.getCapacidadBotella() >= 500 && bebida.getCapacidadBotella() <= 750) {

			System.out.println("La bebida con Alcohol se ingreso a la caja Correctamente XD!!!");
			cajaBebidas.add(bebida);
			chequeoCantidadCaja(cajaBebidas);

		} else {
			System.out.println("La bebida con Alcohol sobrepasa la capacidad standard");
		}
		
		return cajaBebidas;
	}

	void chequeoCantidadCaja(ArrayList<Bebida> cajaBebidas) {

		if (cajaBebidas.size() < 3) {
			Integer numBotellas= cajaBebidas.size();
			
			System.out.println("Puede continuar agregando a la caja, llevan "+ numBotellas+" Botellas de Bebida Alcoholica"+"\n");

		} else {
			System.out.println("La caja de bebidas Alcoholicas esta llena!!!!");
			super.guardoCajas(cajaBebidas);
			super.creoCaja();
		}

	}

}
