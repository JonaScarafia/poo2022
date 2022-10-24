package state;

import java.util.Random;

import context.Banco;

public class CajaCerrada implements State{


	private Banco banco;
	private Integer edad;

	Random rand = new Random();

	@Override
	public void Ocupada() {
		
	}

	@Override
	public void Abierta() {
	}

	public void Suspendida() {

	}

	public void Cerrada() {

		System.out.println("La caja esta cerrada, vuelva Pronto! ");
		banco.setState(new CajaCerrada(), "cajero1");

	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public void estadoActual() {
	System.out.println("La caja esta cerrada");
		
	}
	
}
