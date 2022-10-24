package main;

import java.util.Scanner;

import context.Banco;

public class Menu {
	Banco banco;

	public Menu(Banco banco) {
		this.banco =banco;
	}

	public void display() {
		Scanner scanner = new Scanner(System.in);
		char opcion;
		String mensajeOpciones = "Realizar acción: " + "a) Caja Cerrada, d) Caja Ocupada, j) Caja Suspendida"+
				"p) preguntar, s) salir";

		while (true) {
			System.out.println(mensajeOpciones);
			opcion = scanner.next().charAt(0);
			switch (opcion) {
			case 'a': banco.cajaCerrada(); break;
			case 'd': banco.cajaOcupada(); break;
			case 'j': banco.cajaSuspendida(); break;
			case 'p': banco.estadoActual(); break;
			case 's': System.out.println("Hasta pronto!"); System.exit(0);
			default: System.out.println("Opcion no válida");
			}
		}
	}
}



