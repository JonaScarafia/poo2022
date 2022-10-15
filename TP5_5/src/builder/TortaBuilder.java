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
	
	public TipoTorta getTipo() {
		return tipo;
	}
	public void setTipo(TipoTorta tipo) {
		this.tipo = tipo;
	}
	public Masa getMasa() {
		return masa;
	}
	public void setMasa(Masa masa) {
		this.masa = masa;
	}
	public Relleno getRelleno() {
		return relleno;
	}
	public void setRelleno(Relleno relleno) {
		this.relleno = relleno;
	}
	public Mezcla getMezcla() {
		return mezcla;
	}
	public void setMezcla(Mezcla mezcla) {
		this.mezcla = mezcla;
	}
	
	public Torta getResultado() {
		return new Torta(tipo, masa,relleno,mezcla);
	}
	
	//ver///
	
	@Override
	public void setTipoTorta(TipoTorta tipo) {
		// TODO Auto-generated method stub
		
	}
	
}
