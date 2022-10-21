import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observadores = new ArrayList<Observer>();
	private Integer estado;
	
	public Integer getEstado() {
		return estado;
	}
	
	public void setEstado(Integer estado) {
		this.estado = estado;
		notificarTodosObservadores();
		
	}
	
	public void agregar(Observer observador) {
		observadores.add(observador);
	}
	
	public void notificarTodosObservadores() {
		for (Observer observer : observadores) {
			
			observer.actualizar();
			
		}
		
	}
}
