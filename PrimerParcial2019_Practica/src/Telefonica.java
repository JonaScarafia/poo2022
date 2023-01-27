import java.util.Random;

public class Telefonica extends Red{

	Random rand = new Random();
	
	public String generarIp() {
		
		Integer ip=rand.nextInt(86)+170;
		String ipT = String.valueOf(ip);
		
		String ipTelefonica =super.generarIp()+ipT;
		
		System.out.println(ipTelefonica);
		
		return ipTelefonica;
	}
	
}
