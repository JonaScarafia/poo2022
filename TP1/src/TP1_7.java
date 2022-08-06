import java.util.Scanner;

//	Desarrolle un programa que concatene dos frases ingresadas por el teclado y luego lo muestre por consola

public class TP1_7 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);	
	System.out.println("Ingrese la primera frase: ");
	String word1 = input.nextLine();
	
	System.out.println("Ingrese la segunda frase: ");
	String word2 = input.nextLine();
	
	System.out.println("La concatenacion de las dos palabras ingresadas es: "+ word1 + " "+ word2);
	input.close();
	}

}
