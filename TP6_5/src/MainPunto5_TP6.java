
public class MainPunto5_TP6 {

	public static void main(String[] args) {

		Servidor servidor = new Servidor();

		new Boya("CIDMAR-1", servidor).start();
		new Boya("CIDMAR-2", servidor).start();
		
		//debe ser la misma instancia de servidor para compartir
		new Cientifico(servidor).start();
		
// o tambien podía hacer
		//boya1.start();
		//boya2.start();
	}
}