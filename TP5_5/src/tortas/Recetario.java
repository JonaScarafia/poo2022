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

	public Recetario(TipoTorta tipo, Masa masa, Relleno relleno, Mezcla mezcla) {
		super();
		this.tipo = tipo;
		this.masa = masa;
		this.relleno = relleno;
		this.mezcla = mezcla;
	}

	public String toString() {
		String info ="";
		info +="Tipo de Torta: "+ tipo+"\n";
		info +=" Tipo de Masa: "+ masa+"\n";
		info +="Tipo de relleno: "+ relleno+"\n";
		info +="Masa: Cantidad de huevos: "+ mezcla.getHuevos()+" Tiempo de coccion en minutos "+mezcla.getTiempoCoccion()+"'"+" Cantidad de Harina en kilogramos "+mezcla.getHarina()+" kg "+"\n";
		
		return info;
	}


}
