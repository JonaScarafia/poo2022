package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Strategy.CatalogoAdolescente;
import Strategy.CatalogoGeneral;
import Strategy.CatalogoNinios;
import Strategy.CatalogoStrategy;

public class MainP12_TP5 {

	/*
	 * PUNTO 12
	 * 
	 * En una plataforma de streaming de peliculas se desea consultar el catalogo.
	 * Sin embargo hay diferentes situaciones que podrían llevar a que el sea
	 * filtrado de diferentes formas, un ejemplo de ello es cuando la cuenta que
	 * esta usando el sistema pertenece a un niño. En este caso el catálogo solo
	 * debe mostrar peliculas que no sean para mayores de 13 años
	 * 
	 * Utilizando el patron strategy defina una estrategia general que retorne el
	 * catalogo completo y luego una estrategia para ñinos que filtra las peliculas
	 * por edad.
	 * 
	 * Escriba en consola el listado implementando la estrategia para todo el
	 * catalogo. Luego imprima el listado usando la estrategia para menores de 13.
	 * 
	 * Finalmente, implemente una tercera estrategia que retorne el catalogo de
	 * peliculas para menores de 18 años. Compruebe el resultado en consola.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Seleccione el catalogo que desea ver:\n 1- Niños \n 2-Adolescente \n 3-General");
			String opcionIngresada;

			opcionIngresada = reader.readLine();
			
			if (opcionIngresada.equals("1") || opcionIngresada.equals("2")) {


				CatalogoStrategy mostrar = opcionIngresada.equals("1")? new CatalogoNinios() : new CatalogoAdolescente();

				mostrar.mostrarCatalogo();
			}
			
			if (opcionIngresada.equals("3")) {

				CatalogoStrategy mostrar = opcionIngresada.equals("3")? new CatalogoGeneral() : new CatalogoGeneral();

				mostrar.mostrarCatalogo();
				
			}


	}catch(

			IOException e)
	{
		e.printStackTrace();
	}

}

}
