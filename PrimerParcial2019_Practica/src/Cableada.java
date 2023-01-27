import java.util.Random;

public class Cableada extends Red{
	Random rand = new Random();
	
	public String generarIp() {	
		
		Integer ip=rand.nextInt(85)+1;
		String ipC = String.valueOf(ip);
		
		String ipCableado =super.generarIp()+ipC;
		
		System.out.println(ipCableado);
		
		return ipCableado;
	}

}
