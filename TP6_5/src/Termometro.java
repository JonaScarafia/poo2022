import java.util.concurrent.ThreadLocalRandom;

public class Termometro implements Sensor {

	public Double sensar() {

		return ThreadLocalRandom.current().nextDouble(5, 30);
	}

}
