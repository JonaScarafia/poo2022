
public class HiloExtendiendo extends Thread {

	private long Id;

	public HiloExtendiendo(Integer id) {
		super();
		Id = id;
	}

	public long getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	@Override
	public void run() {

		try {

			System.out.println("Hola mundo soy un hilo " + Thread.currentThread().getName()
					+ " heredando de la clase Thread " + "con id " + getId());

			if (getId() == 0) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(0000);

			}
			
			if (getId() == 1) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(1000);

			}
			if (getId() == 2) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(2000);

			}
			if (getId() == 3) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(3000);

			}
			
			if (getId() == 4) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(4000);

			}
			if (getId() == 5) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(5000);

			}
			if (getId() == 6) {
				System.out.println("el hilo "+Thread.currentThread().getName()+" Se va a dormir");
				Thread.sleep(6000);

			}

		} catch (Exception e) {

		}

	}

	/*
	 * Limitado a que se debe heredar de la clase Thread, util para aplicaciones
	 * simples. La clase Thread defin un numero de metodos para el tratamiento de
	 * hilos, incluidos metodos estaticos que proveen informacion de cambios de
	 * estados
	 * 
	 * 
	 */
}
