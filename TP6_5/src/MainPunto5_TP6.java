
public class MainPunto5_TP6 {

	public static void main(String[] args) {

		Servidor servidor = new Servidor();

		new Boya("CIDMAR-1", servidor).start();
		new Boya("CIDMAR-2", servidor).start();
		new Cientifico(servidor).start();

	}
}