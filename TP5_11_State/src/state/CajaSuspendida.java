package state;

import java.util.Random;

import context.Banco;

public class CajaSuspendida implements State{

	private Banco banco;
	private Integer edad;

	Random rand = new Random();

	@Override
	public void Ocupada() {

		System.out.println(" La caja esta suspendida, Espere por favor!  ");
		
	}

	@Override
	public void Abierta() {
	}

	public void Suspendida() {

		edad = rand.nextInt(41) + 60;
		{
			if (edad <= 60) {
				System.out.println("Solo Se atiendo a mayores de 60 años");
			} else {
				System.out.println("La caja esta suspendida, espere por favor ");
			}
			banco.setState(new CajaOcupada(), "cajero1");
			
		}

	}

	public void Cerrada() {

	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void estadoActual() {
		System.out.println("la caja esta suspendida");
		
	}
	
	public String toString() {
		return "suspendida";
	}
}
