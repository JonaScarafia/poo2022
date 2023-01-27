import java.util.Random;

public class Wifi extends Red {

	Random rand = new Random();
	
	public String generarIp() {
		
		
		Integer ip=rand.nextInt(85)+86;
		//String ipT = String.valueOf(ip);
		
		String ipWifi =super.generarIp()+String.valueOf(ip);
		
		System.out.println(ipWifi);
		
	
		
		return ipWifi;
	}
	
}
