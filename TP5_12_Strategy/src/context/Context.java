package context;

import Strategy.CatalogoStrategy;

public class Context {

	private CatalogoStrategy patronStrategy;

	public Context(CatalogoStrategy patronStrategy) {
		this.patronStrategy = patronStrategy;
	}

	public void ejecutar() {
		this.patronStrategy.mostrarCatalogo();
	}

}
