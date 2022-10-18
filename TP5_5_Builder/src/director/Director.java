package director;

import builder.Builder;
import ingredientes.Masa;
import ingredientes.Mezcla;
import ingredientes.Relleno;
import tortas.TipoTorta;

public class Director {

	public void buildTortaRellena(Builder builder) {

		builder.setTipoTorta(TipoTorta.COCO);
		builder.setMasa(Masa.NUECES);
		builder.setRelleno(Relleno.CON_RELLENO);
		builder.setMezcla(new Mezcla(3, 75, 1.5));
	}

	public void buildTortaSinNada(Builder builder) {

		builder.setTipoTorta(TipoTorta.YERBAMATE);
		builder.setMasa(Masa.SIN_NADA);
		builder.setRelleno(Relleno.SIN_RELLENO);
		builder.setMezcla(new Mezcla(3, 60, 1.5));
	}

	public void buildTortaSaborizada(Builder builder) {

		builder.setTipoTorta(TipoTorta.VAINILLA);
		builder.setMasa(Masa.SABORIZADA);
		builder.setRelleno(Relleno.SIN_RELLENO);
		builder.setMezcla(new Mezcla(3, 60, 1.5));

	}
	
}
