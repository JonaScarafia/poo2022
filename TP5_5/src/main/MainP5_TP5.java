package main;

import builder.RecetarioBuilder;
import builder.TortaBuilder;
import director.Director;
import tortas.Recetario;
import tortas.Torta;

/*

PUNTO 5 Aplique el patron Builder para la construccion de  tres tipos de tortas, una torta deberá tener como atributo la masa y el relleno.
Las tortas deben ser de vainilla, coco y una a su eleccion para demostrar el objetivo del patrón solicitado
  
*/


public class MainP5_TP5 {

	public static void main(String[] args) {
		
		Director director = new Director();
		
		TortaBuilder builder = new TortaBuilder();
		
		director.buildTortaRellena(builder);
		
		Torta torta = builder.getResultado();
		System.out.println("La torta cocinada es: " +torta.getTipo());
		
		
		RecetarioBuilder recetariobuilder = new RecetarioBuilder();
		
		director.buildTortaRellena(recetariobuilder);
		Recetario recetario = recetariobuilder.getResultado();
		System.out.println("Recetario de la torta: "+ recetario);

	}

}
