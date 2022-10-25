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
	
	public void cajaAbierta() {
		this.estado.Abierta();
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
	
	


	public State getEstado() {
		return estado;
	}


	public void setEstado(State estado) {
		this.estado = estado;
	}



	public String toString() {
	StringBuffer result = new StringBuffer();
	result.append("La caja esta "+ this.getEstado()+"\n");
	
		return result.toString();
	
	}

	
	
 

}
