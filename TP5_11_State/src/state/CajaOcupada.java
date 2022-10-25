package state;

import java.util.Random;

import context.Banco;

public class CajaOcupada implements State {

	private Banco banco;
	private Integer edad;

	Random rand = new Random();

	@Override
	public void Ocupada() {

		System.out.println(" La caja esta siendo ocupada, Espere por favor!  ");
		banco.setState(new CajaAbierta(), "cajero1");
	}

	@Override
	public void Abierta() {
		System.out.println(" La caja esta ocupada");
	
	}

	public void Suspendida() {

		edad = rand.nextInt(41) + 60;
		{
			if (edad <= 60) {
				System.out.println("caja ocupada");
			} else {
				System.out.println("caja ocupada ");
			}
		
			
		}

	}

	public void Cerrada() {

		System.out.println("La caja esta ocupada ");

	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void estadoActual() {
		System.out.println("La caja esta Ocupada");
		
	}
	
	public String toString() {
		return "ocupada";
	}

}
