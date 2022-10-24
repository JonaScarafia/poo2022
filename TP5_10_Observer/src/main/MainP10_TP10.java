package main;


import observer.Reportero;
import subject.SistemaMetereologico;

/*
 * PUNTO 10 Aplique el patrón de diseño Observer para un sistemas de reporte del clima, defina la clase Sistema Meteorologico
 * que extienda de la clase Observable y tenga como atributo el estado del clima en forma de String. Cda vez que se modifica el clima esté notifica a todos
 * los observadores. El observador va a ser la clase Reportero que implementa la interfaz OBSERVER, el será el encargado de impirmi por consola
 * el clima cuando cambia en el sistema meteorologico.
 * 
 * Pruebe el sistema creando instancias de cada clase y cambiando el clima.
 * 
 * 
 * 
 * 
 * 
 * */


public class MainP10_TP10 {

	public static void main(String[] args) {
		
		SistemaMetereologico observable = new SistemaMetereologico();
		observable.agregarReporteros(new Reportero("Juan", "telefe"));
		observable.agregarReporteros(new Reportero("Juan8", "canal13"));
		observable.setEstadoClima("lluvia");
		
		
	}
	
	


}
