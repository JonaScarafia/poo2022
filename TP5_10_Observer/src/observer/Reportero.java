package observer;

public class Reportero implements Observer{

	private String nombre, canalTv;
	
	
	public Reportero(String nombre, String canalTv) {
		super();
		this.nombre = nombre;
		this.canalTv = canalTv;
	}

	@Override
	public void actualizarClima() {
			System.out.println("Informa el reportero "+nombre +" del canal "+canalTv +" que se actualizo el clima ");
	}

}
