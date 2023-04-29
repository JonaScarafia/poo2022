import java.util.ArrayList;

public class SinAlcohol extends TipoCaja {

	public SinAlcohol(String tipoBebida, Integer limiteAcopio) {
		super(tipoBebida, limiteAcopio);

	}

	public ArrayList<Bebida> empaquetarBebida(Bebida bebida) {
		// Preguntar si estaría mal si violaria el single responsability
		if (bebida.getCapacidadBotella() > 950 && bebida.getCapacidadBotella() <= 1200 && super.cajaBebidas.size() < 3) {

			
			
			System.out.println("La Bebida Sin Alcohol se ingreso a la caja Correctamente XD!!!");
		
			cajaBebidas.add(bebida);
			//chequeoCantidadCaja(cajaBebidas);

		} else {
			System.out.println("La Bebida Sin Alcohol sobrepasa la capacidad standard");
		}

		return cajaBebidas;
	}

	void chequeoCantidadCaja(ArrayList<Bebida> cajaBebidas) {

		//if (cajaBebidas.size() <3) {
			
			Integer numBotellas= cajaBebidas.size();
			System.out.println("Puede continuar agregando a la caja, llevan "+ numBotellas+" Botellas de Bebida Sin Alcohol"+"\n");
		
		//}

		if (cajaBebidas.size()>super.limiteAcopio) { //preguntar si esta bien
			
			System.out.println("La caja de Bebidas Sin Alcohol esta llena!");
			super.guardoCajas(cajaBebidas);
			super.creoCaja();
		
		} 
			
			
		
		
	}
}
