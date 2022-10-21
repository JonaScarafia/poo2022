
public class MainEjemplo_Strategy {

	public static void main(String[] args) {
		
		Context contexto = new Context (new AntivirusSimple());
		contexto.ejecutar();
		
		Context contexto1 = new Context (new AntivirusAvanzado());
		contexto1.ejecutar();
	}

}
