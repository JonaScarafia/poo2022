package builder;

import ingredientes.Masa;
import ingredientes.Mezcla;
import ingredientes.Relleno;

import tortas.TipoTorta;
import tortas.Torta;

public class TortaBuilder implements Builder {
	
	private TipoTorta tipo;
	private Masa masa;
	private Relleno relleno;
	private Mezcla mezcla;
	
	public void setTipoTorta(TipoTorta tipo) {
		 this.tipo = tipo;
		
	}

	public void setMasa(Masa masa) {
		this.masa =masa;
		
	}

	public void setRelleno(Relleno relleno) {
		this.relleno = relleno;
		
	}

	
	public void setMezcla(Mezcla mezcla) {
		this.mezcla =mezcla;
		
	}
	
	
	public Torta getResultado() {
		return new Torta(tipo, masa,relleno,mezcla);
	}
	
}
