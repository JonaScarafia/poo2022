
public class MainEjemplo2_Prod_Cons {

	public static void main(String[] args) {
	

		Buffer bufer =new Buffer(10);
		
		Productor productor1 =new Productor(bufer);
		Consumidor consumidor1 = new Consumidor(bufer);
		
		productor1.start();
		consumidor1.start();
	}

}
