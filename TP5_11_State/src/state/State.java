package state;

import context.Banco;

public interface State {
	
	public void Ocupada();
	public void Abierta();
	public void Suspendida();
	public void Cerrada();
	public void estadoActual();
	
	void setBanco(Banco banco);
	
}
