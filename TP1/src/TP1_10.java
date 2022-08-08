import java.security.SecureRandom;
import java.util.Scanner;

//// PUNTO 10

/* Desarrolle un programa que elija dos números enteros aleatorios. Si los dos números son iguales, deberá repetir la operación 
 * hasta que los dos sean distintos. El programa deberá preguntar si elegimos 
apostar por el valor 1 o el valor 2 (Gana el valor más alto). 
Una vez el usuario haya introducido su apuesta se deberá mostrar los valores e indicar si el usuario a ganado o perdido, tras una jugada nos 
deberá preguntar si queremos volver a jugar, en caso de que el usuario no lo desee se deberá mostrar 
la cantidad de partidas ganadas y perdidas por este hasta el momento. El programa debe contemplar 
las consistencias necesarias para que no se ingresen valores no deseados

*/
	

public class TP1_10 {

	public static void main(String[] args) {
		int number1, number2;
		int winner =0, loser= 0;
		boolean valid;
		String answer;
		
		Scanner input = new Scanner(System.in);
		SecureRandom secRan = new SecureRandom();
		
		
		do {
			do {
				 number1 = secRan.nextInt(20);
				 number2 = secRan.nextInt(20);
				 valid = number1 != number2;
				
				
			} while (!valid);
			System.out.println("¿Por que valor desea apostar? \r Opcion [1] ó numero opcion [2]");
			
			do {
				answer= input.next();
				valid = answer.matches("[1-2]");
				
					if (!valid) {
						System.out.println("Ingrese un valor Valido por favor.");
					}
				
			} while (!valid);
			System.out.println("\t" + number1 + " | " + number2);
			
			if((answer.equals("1") & (number1 > number2)) || (answer.equals("2") & (number2 >number1))) {
				System.out.println("GANASTEEEEEEEEEEE!!!!! B) ");
				winner++;
			}
			else {
				System.out.println("PERDISTE :/ T.T ");
				loser++;
			}
			System.out.println("Queres volver a jugar? [S]i [N]o" );
			
			do {
				answer = input.next();
				valid= answer.matches("[nNsS]");
				if (!valid) {
					System.out.println("Ingrese un valor valido por favor");
				}
				}while(!valid);
		
		} while (!answer.equalsIgnoreCase("n"));
		System.out.println("\r[RESULTADOS]\rGanadas:" + winner + "\rPerdidas: " + loser);
		
		input.close();
		
	}

}
