package main;

import context.Banco;

public class MainP11_TP5 {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		System.out.println(banco);
		
		//Test ocupado
		banco.cajaOcupada();
		//banco.estadoActual(); // puedo utilizar esto o el to string
		System.out.println(banco);
		
		//test suspendida
		banco.cajaSuspendida();
		System.out.println(banco);
		
		//test Cerrada
		banco.cajaCerrada();
		System.out.println(banco);
		
		//test caja abierta
		banco.cajaAbierta();
		System.out.println(banco);

	}

}
