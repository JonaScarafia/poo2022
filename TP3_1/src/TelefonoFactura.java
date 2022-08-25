
public class TelefonoFactura extends Telefono {

	private Double saldo, datos, minutos;

	public TelefonoFactura(String nombre, String marca, String modelo, int numero, Double saldo,Double datos, Double minutos) {
		super(nombre, marca, modelo, numero);
		
		this.saldo=saldo;
		this.datos=datos;
		this.minutos=minutos;

	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDatos() {
		return datos;
	}

	public void setDatos(Double datos) {
		this.datos = datos;
	}

	public Double getMinutos() {
		return minutos;
	}

	public void setMinutos(Double minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Telefono utilizado con factura "+ super.toString()+ "\n Gastos mensuales "+ getSaldo() + "\n gastos en datos=" + getDatos() + "\n gastos en minutos= " + getMinutos() + ")";
	}
	

	
	

}
