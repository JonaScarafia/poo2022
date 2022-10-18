package builder;

import ingredientes.Masa;
import ingredientes.Mezcla;
import ingredientes.Relleno;
import tortas.TipoTorta;

public interface Builder {

	public void setTipoTorta(TipoTorta tipo);
	public void setMasa(Masa masa);
	public void setRelleno(Relleno relleno);
	public void setMezcla(Mezcla mezcla);
	
}
