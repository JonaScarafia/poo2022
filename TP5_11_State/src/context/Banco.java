package context;

import state.CajaAbierta;
import state.State;

public class Banco {

	private State estado;
	private String nombreCajero;
	
	public Banco() {
		setState(new CajaAbierta(), nombreCajero);
	}
	

	public void  setState(State estado, String nombreCajero) {

		this.estado = estado;
		this.estado.setBanco(this);
		
		this.nombreCajero = nombreCajero;
		
	}
	
	public void cajaCerrada() {
		this.estado.Cerrada();
	}
	public void cajaOcupada() {
		this.estado.Ocupada();
	}
	
	public void cajaSuspendida() {
		this.estado.Suspendida();
	}
	
	public void estadoActual() {
		this.estado.estadoActual();
	}

//public void estadoActual() {
//	this.estado.estadoActual();
//}
	
 

}
