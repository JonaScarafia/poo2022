import java.util.Scanner;

/*Desarrolle un programa que demuestre la particularidad que se debe tomar en cuenta al comparar dos string (cadenas) en java
 * El usuario debe ingresar ambas cadenas y luego mostrar el resultado al compararlo con el operador "==" y el metodo ".equal()"
 * 
 * Ejemplo de salida por consola:
 * 
 * Escriba la primer palabra:;
 * hola
 * Escriba la segunda palabra
 * hola
 * false
 * comparando con .equals() : true
 * 
 */


public class TP1_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese la primera: ");
		
		String word1 = input.nextLine();
		
		System.out.println("Ingrese la segunda palabra: ");
		String word2 = input.nextLine();
		
		if (word1 == word2) {
			System.out.println("True ;)");
		}else {
			System.out.println("FALSE :/");
		}
		if(word1 .equals(word2)) {
			System.out.println("Comparado con equal(): True");
		}else {
			System.out.println("Comparado con equals(): False :/ ");
		}
		input.close();
	}

}
