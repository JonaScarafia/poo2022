package subject;

import java.util.LinkedList;

import observer.Reportero;

public class Clima {
	public LinkedList<Reportero> reporteros = new LinkedList<>();

	
	public void agregarReporteros(Reportero reportero) {

		reporteros.add(reportero);

	}

	public void eliminarReportero(Reportero reportero) {

		reporteros.remove(reportero);

	}

	public void notificarReporteros() {

		for (Reportero reportero : reporteros) {

			reportero.actualizarClima();
		}

	}
}
