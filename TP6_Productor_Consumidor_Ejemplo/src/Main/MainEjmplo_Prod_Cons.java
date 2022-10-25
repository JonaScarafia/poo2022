package Main;

import Banco.Cuenta;
import Banco.Familiar;
import Banco.Hijo;

public class MainEjmplo_Prod_Cons {

	public static void main(String[] args) {

		
		Cuenta cuenta1 = new Cuenta();
		
		Familiar padre = new Familiar("Fausto",cuenta1,5000.0);
		Familiar madre = new Familiar("Petrona", cuenta1,2500.0);
				
		Hijo hijoMayor = new Hijo("Jonas",cuenta1,250.0);
		Hijo hijaMenor = new Hijo("Maria Agustina", cuenta1, 500.0);
	
		
		padre.start();
		madre.start();
		
		hijoMayor.start();
		hijaMenor.start();
		
		
	}

}
