import java.security.SecureRandom;
import java.util.Scanner;

/*
Desarrolle un programa que indique como es un número ingresado por el usuario con respecto a otro que es generado aleatoriamente del 1 al 10 al comenzar
el programa.
Debe de evaluar si es igual, menos, mayor distinto, menor igual y mayor igual.

ingrese el primer numero
7
7 es distinto a 9
7 es menor a  9
7 es menor o igual a 9

*/

public class TP1_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos a realizar una comparacion");
		System.out.println("Ingrese el primer numero a comparar");
		
		int number1 = input.nextInt();
		
		SecureRandom numRan = new SecureRandom();
		
		int number2 = numRan.nextInt(10);
		
		if (number1 != number2 & number1 <= number2) { 
			System.out.println(number1 + " "+"es distinto de "+" "+number2);
			System.out.println(number1 + " "+"es menor a "+" "+number2);
			System.out.println(number1 + " "+"es menor o igual "+" "+number2);
			
		} else if(number1 != number2){
			System.out.println(number1 + " "+"es distinto de "+" "+number2);
		}
		input.close();
	
		
	}

}
