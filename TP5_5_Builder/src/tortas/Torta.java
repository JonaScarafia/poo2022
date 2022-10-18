package tortas;

import ingredientes.Masa;
import ingredientes.Mezcla;
import ingredientes.Relleno;

public class Torta {

	private TipoTorta tipo;
	private Masa masa;
	private Relleno relleno;
	private Mezcla mezcla;

	public Torta(TipoTorta tipo, Masa masa, Relleno relleno, Mezcla mezcla) {

		this.tipo = tipo;
		this.masa = masa;
		this.relleno = relleno;
		this.mezcla = mezcla;

	}

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

}
