package Banco;

import java.util.Random;

public class Familiar extends Thread {

	private String nombre;
	private Cuenta cuenta;
	private Double monto;

	public Familiar(String nombre, Cuenta cuenta, Double monto) {

		this.nombre = nombre;
		this.cuenta = cuenta;
		this.monto = monto;
	}

	public Familiar() {

	}

	public void run() {

		try {
			Random rand = new Random();

			Integer tiempoTarda = (rand.nextInt(6) + 10) *1000;
 
			Thread.sleep(tiempoTarda);
			
			cuenta.depositoFamiliar(nombre, monto, tiempoTarda);

		} catch (Exception e) {
			System.out.println("ERROORR");
		}

	}

}
