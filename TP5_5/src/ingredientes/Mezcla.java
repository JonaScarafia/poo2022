package ingredientes;

public class Mezcla {

	private Integer huevos, tiempoCoccion;
	private Double harina;

	public Mezcla(Integer huevos, Integer tiempoCoccion, Double harina) {
		super();
		this.huevos = huevos;
		this.tiempoCoccion = tiempoCoccion;
		this.harina = harina;
	}

	public Integer getHuevos() {
		return huevos;
	}

	public void setHuevos(Integer huevos) {
		this.huevos = huevos;
	}

	public Integer getTiempoCoccion() {
		return tiempoCoccion;
	}

	public void setTiempoCoccion(Integer tiempoCoccion) {
		this.tiempoCoccion = tiempoCoccion;
	}

	public Double getHarina() {
		return harina;
	}

	public void setHarina(Double harina) {
		this.harina = harina;
	}

}
