package Banco;

import java.util.Random;

public class Hijo extends Thread {

	private String nombre;
	private Cuenta cuenta;
	private Double monto;

	public Hijo(String nombre, Cuenta cuenta, Double monto) {

		this.nombre = nombre;
		this.cuenta = cuenta;
		this.monto = monto;

	}

	public Hijo() {

	}

	public void run() {

		try {
			
			Random rand = new Random();

			Integer tiempoTarda = (rand.nextInt(6) + 5) *1000;
 
			Thread.sleep(tiempoTarda);
			
			cuenta.extraccionHijo(nombre, monto, tiempoTarda);
			
		} catch (Exception e) {
			System.out.println("ERROORR");
		}
		
	}

}
