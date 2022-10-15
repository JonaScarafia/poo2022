package tortas;

import ingredientes.Masa;
import ingredientes.Mezcla;
import ingredientes.Relleno;

public class Recetario {

	private Integer cantidadHojas= 1;
	private TipoTorta tipo;
	private Masa masa;
	private Relleno relleno;
	private Mezcla mezcla;

	public Recetario(Integer cantidadHojas, TipoTorta tipo, Masa masa, Relleno relleno, Mezcla mezcla) {
		super();
		this.cantidadHojas = cantidadHojas;
		this.tipo = tipo;
		this.masa = masa;
		this.relleno = relleno;
		this.mezcla = mezcla;
	}

	public Integer getCantidadHojas() {
		return cantidadHojas;
	}

	public void setCantidadHojas(Integer cantidadHojas) {
		this.cantidadHojas = cantidadHojas;
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
