package Banco;

public class Cuenta {

	private Double saldo;

	public Cuenta() {

		this.saldo = 0.0;

	}

	public synchronized void extraccionHijo(String nombre, Double montoExtraccion, Integer tiempoTarda) {

		try {

			while (montoExtraccion > saldo) {

				System.out.println("ERORR!!! al extraer el nombre es: " + nombre + " Debe esperar...");
				System.out.println("ERORR!!! quiere extraer: " + montoExtraccion + " Saldo Actual: " + saldo);
				System.out.println("ERORR!!! Saldo Insuficiente \n");
				wait(); // con esto hacemos que el hilo hijo espere
			}

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("EXTRACCION el saldo antes de la extraccion seria: " + saldo);
			System.out.println("EXTRACCION el monto a extraer es: " + montoExtraccion);
			saldo = saldo - montoExtraccion;
			System.out.println("Su saldo luego de la extraccion es de: " + saldo);
			System.out.println("EXTRACCION el tiempo que tardo en realizar la extraccion fue de: " + tiempoTarda / 1000
					+ " segundos");
			System.out.println("OPERACION EXITOSA \n");

		} catch (Exception e) {

			System.out.println("Error en el Try");
		}

	}

	public synchronized void depositoFamiliar(String nombre, Double montoDeposito, Integer tiempoTarda) {

		if (montoDeposito >= 100 && montoDeposito <= 5000) {

			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("DEPOSITAR el nombre del que deposita es: " + nombre);
			System.out.println("DEPOSITAR el monto a depositar es: " + montoDeposito);
			saldo = saldo + montoDeposito;
			System.out.println("Su saldo luego del deposito es de: " + saldo);
			System.out.println(
					"DEPOSITO el tiempo que tardo en realizar el deposito fue de :" + tiempoTarda / 1000 + " segundos");
			System.out.println("OPERACION EXITOSA \n");

			notifyAll();// notifico a los hijos que esten esperando

		} else {
			System.out.println("No se puede depositar");
			System.out.println("El monto debe ser entre $100 y $5000");
		}

	}

}
