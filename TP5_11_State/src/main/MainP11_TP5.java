package main;

import context.Banco;

public class MainP11_TP5 {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		new Menu(banco).display();

	}

}
