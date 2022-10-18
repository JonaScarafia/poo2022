import java.util.Random;


public class Anemometro implements Sensor {

	public Double sensar() {
//Double fio;
		return(new Random().nextDouble()*60)+0;
	}

}
