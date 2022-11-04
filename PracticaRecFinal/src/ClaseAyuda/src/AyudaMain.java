import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class AyudaMain {

	public static void main(String[] args) {
		//IF CORTO:
		
        int a = 1;
        int b = 2;
        System.out.println("numeroMayor: " + ((a > b) ? "a es mayor" : "b es mayor"));
		//--------------------------------------------------------------------------------------------
		//Reducir a DOS DECIMALES:
		
		Double precio = 12.345678;
		
		String.format("%.2f",precio);//lo convierte en cadena, util solo para mostrar resultados
		//2f: dos deciameles, 3f tres decimales etc
		
		//--------------------------------------------------------------------------------------------
		//Declaracion de un ARRAYLIST
		
		ArrayList<String> nombre_arreglo = new ArrayList<String>();	
	
		nombre_arreglo.add("Lenguaje");
        //nombre_arreglo.add(3);
        //nombre_arreglo.add('a');
        //nombre_arreglo.add(23.5);
		
		/*
		  size()Devuelve el número de elementos (int)
          add(X) Añade el objeto X al final. Devuelve true.
          add(posición, X) Inserta el objeto X en la posición indicada.
          get(posicion) Devuelve el elemento que está en la posición indicada.Sirve para no retirar el elemento
          remove(posicion) Elimina el elemento que se encuentra en la posición indicada. Devuelve el elemento eliminado.
          remove(X) Elimina la primera ocurrencia del objeto X. Devuelve true si el elemento está en la lista.
          clear() Elimina todos los elementos.
          set(posición, X) Sustituye el elemento que se encuentra en la posición indicada por el objeto X. Devuelve el elemento sustituido.
          contains(X) Comprueba si la colección contiene al objeto X. Devuelve true o false.
          indexOf(X) Devuelve la posición del objeto X. Si no existe devuelve -1
		 */
		
		 //RECORRER UN ARRAYLIST
		 //Podemos recorrerlo de forma clásica con un bucle for:

		 for(int i = 0;i < nombre_arreglo.size();i++){
		     System.out.println(nombre_arreglo.get(i));      
		 }


         //Con un bucle foreach:
         //Si suponemos el array de enteros llamado numeros:
		 ArrayList<Integer> numeros = new ArrayList<Integer>();	
		 
		 for(Integer i: numeros){
		     System.out.println(i);                 
		 }

		// Si el array contiene objetos de tipos distintos o desconocemos el tipo:

        //for(Object o: nombreArray){
        //		  System.out.println(o);                 
        //}
		
		 /*
		 Utilizando un objeto Iterator.
		 La ventaja de utilizar un Iterador es que no necesitamos indicar el tipo de objetos que contiene el array.
		 Iterator tiene como métodos:
		 hasNext: devuelve true si hay más elementos en el array.
		 next: devuelve el siguiente objeto contenido en el array.
         */
         //Ejemplo:

		 ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		
		 //se insertan elementos y...

		 Iterator<Integer> it = numeros2.iterator(); //se crea el iterador it para recorrer el array numeros                   
		 while(it.hasNext()){                    //mientras queden elementos
		       System.out.println(it.next());    //se obtienen y se muestran                                               
		 }
	//--------------------------------------------------------------------------------------------------------------	
		//Declaracion de un Random
		
		Random rnd = new Random();
		//-----FORMULA-----:
		//Integer num = rnd.nextInt(HASTA-DESDE+1)+DESDE
		 
		Integer num = rnd.nextInt(6)+1; //Da un numero aleatorio entre 1 y 6
		Integer num2 = rnd.nextInt(1,6); //Otra forma de generar entre 1 y 6
		Double num3 = rnd.nextDouble(1.1,6.5);//de tiplo double, entre 1,1 y 6,5
		Boolean num4 = rnd.nextBoolean(); //genera true o false aleatorimanete
		
		// Random con metodo de clase Math (es metodo estatico, no se instancia)
		System.out.println(Math.random()); // devuelve valor de 0.0 a 1.0
			
	//--------------------------------------------------------------------------------------------------------------
		//Declaracion de una Hash Map
		
		//HashMap <String,Integer> nombre_hash = new HashMap <String,Integer>();
		
		//Recorro Hash map usando Iterator
	//private HashMap<Persona, Double> cuentas = new HashMap<Persona, Double>();

	    //Usando Iterator
		
		//Iterator<Persona> it = cuentas.keySet().iterator();
		
//		while (it.hasNext()){
//		Persona key = it.next();
		//System.out.println("Nombre cliente: "+key.getNombre()+ " " +"Saldo: " +cuentas.get(key));
		//}
		
	//}

	// Recorro solo los valores(value)
//	for(Double value:cuentas.values()){
//		System.out.println("Value = " + value);
//	}

	// Recorrro solos los key
//	for(Persona key2:cuentas.keySet()){ // Suponiendo que existe la clase Persona
//		System.out.println("Key = " + key2.getNombre());
//	}

	/*
	 //Otras funciones de HashMap
	nombreMap.size(); // Devuelve el numero de elementos del Map
	nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
	nombreMap.put(K clave, V valor); // Añade un elemento al Map
	nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
	nombreMap.clear(); // Borra todos los componentes del Map
	nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
	nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
	nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
	nombreMap.values(); // Devuelve una "Collection" con los valores del Map
	 */

	// --------------------------------------------------------------------------------------------------------------
    // Declaracion de un LinkedList
	
	LinkedList<String> lista1 = new LinkedList<String>();
    lista1.add("juan");
    lista1.add("Luis");
    lista1.add("Carlos");
    imprimir(lista1);//imprimir es metodo estatico al final de esta clase !!!
    lista1.add(1, "ana");
    imprimir(lista1);
    lista1.remove(0);
    imprimir(lista1);
    lista1.remove("Carlos");
    imprimir(lista1);
    
    System.out.println("Cantidad de elementos en la lista:" + lista1.size());
   
    if (lista1.contains("ana")) {
        System.out.println("El nombre 'ana' si esta almacenado en la lista");
    }else {
        System.out.println("El nombre 'ana' no esta almacenado en la lista");
    }
    
    System.out.println("El segundo elemento de la lista es:" + lista1.get(1));
    
    lista1.clear();//borra todo el contenido de la lista
    
    if (lista1.isEmpty()) {
        System.out.println("La lista se encuentra vacía");
    }
	//boolean 	contains​(Object o) 	Returns true if this list contains the specified element.
	
    //----------------------------------------------------------------------------------------------------------------
	
    // IVERTIR CADENA
   
    String sCadena = "texto";
	String sCadenaInvertida = "";
    for(int x = sCadena.length() - 1; x>=0 ; x--){
		sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
      } 
    //---------------------------------------------------------------------------------------------------------------
    //bucle de ingreso de datos por consola
    
    Scanner in = new Scanner(System.in);
    String rta;
    do {
    	System.out.println("Ingrese ip origen ");
		String ipOrigen = in.nextLine().trim();// trim retira espacios dejados delante o atras del texto

		do {
			System.out.println("desea continuar enviando mensajes ? (S//N)");
			rta = in.nextLine();
		} while (!rta.equalsIgnoreCase("n") && !rta.equalsIgnoreCase("s"));
		
	} while (rta.equals("s"));

    //---------------------------------------------------------------------------------------------------------------
  
	// Declaracion de un objeto
	//Nombre_clase nombre_objeto = new Nombre_clase("Atributo1", "Atributo2", "Atributo3");
	// Ejemplo
	//Persona p1 = new Persona("Nikola Tesla", "M", "NTesla@unMail.com", LocalDate.of(1856, 07, 10), "alterna");

	// --------------------------------------------------------------------------------------------------------------
	// Ingreso de datos
	
    Scanner ingreso2 = new Scanner(System.in);
	int valor1 = 0;valor1=ingreso2.nextInt(); // Para el caso de integer

	//Ejemplo de if
//			if (2 == 3) {
//				//Impresion por consola
//				System.out.println("entro");
//			} else {
//				System.out.println("no entro");
//			}

			//Ejemplo de for(inicializo la variable; condicion; incremento de variable)
			for (int i = 0; i < 5; i = i + 2) {
				System.out.println("cantidad de veces: " + i);
			}
			
			//Ejemplo de utilizacion de un While
			int i = 0;
			while (i < 5) {
				System.out.println("i vale  = " + i);
				i++;
			}
			
			//Ejemplo de repetir
			int j = 0;
			do {
				System.out.println("hace algo: " + j);
				j++;
			} while (j < 5);

			int p = 3;
			
			//Ejemplo de switch
			switch (p) {
			case 3:
				System.out.println("entro en 3");
				break;
			case 4:
				System.out.println("entro en 4");
				break;
			default:
				System.out.println("no encontro ninguna de las opciones");
			}

			int suma = 0;
			//arreglo estatico de enteros
			int[] arreglo = { 1, 2, 3, 4, 5 };
			
			//Ejemplo de for each
			for (int d : arreglo) {
				suma = suma + d;
				System.out.println("el valor de la suma es : " + suma);
			}
			
			//Ejemplo de solicitud de elemento ingresado por teclado
			//Se crea un objeto de la clase Scanner
			Scanner ingreso3 = new Scanner(System.in);

			Integer numeroIngresado = 0;
			String texto;

			System.out.println("ingrese un valor: ");
			//Solicitud de ingreso de elementos de tipo integer
			numeroIngresado = ingreso3.nextInt();
			//Solicitud de ingreso de elemento de cualquier tipo transformandolo a String
			System.out.println("ingrese un texto: ");
			texto = ingreso3.next();

			System.out.println("se ingreso el numero: " + numeroIngresado + " y el texto: " + texto);

			///CONVERSION DE TIPOS EN JAVA------------------------------------------------------------------------
			
			//String a Integer//////////////
			
			Integer v = Integer.valueOf("900");
			// o
			int f = Integer.parseInt("900");
			
			//Integer a String/////////////
			
			String importe = Integer.toString(900);
			// o
			int entero = 900;
			String mensaje = String.valueOf(entero);
			
			//char a String////////////////
			
			char codigo = 'A';
			String cadena = Character.toString(codigo);
			
			//String a char////////////////
			
			String cadena1= "E";
			char caracter = cadena1.charAt(0);//solo primer caracter
			
			//String a Double/////////////
			
			double doble = Double.parseDouble("900.1");
			
			//Double a String////////////
			
			double totalDoble = 900.5;
			String totalString = String.valueOf(doble);
			
			//String a Float////////////
			
			float importe1 = Float.parseFloat("900.5");
			
			//Float a String////////////
			
			String total = Float.toString(900.1f);
			
			//String a Boolean/////////
			
			//Boolean boolean = Boolean.valueOf("true");
			// o
			//boolean boolean = Boolean.parseBoolean("false");
			
			//Boolean a String/////////
			
			boolean d = true;
			String cadenaString = String.valueOf(d);
			// o
			boolean h = false;
			String cadenaStringg = Boolean.toString(h);
			
		}//fin metodo main------------------------------------------------------------------------------------------
	
	//metodo para imprimir LinkedList------------------------------------------
	
	public static void imprimir(LinkedList<String> lista) {
        for (String elemento : lista) {
            System.out.print(elemento + "-");
        System.out.println();
        }
    }

}//fin clase Main
