import java.util.HashMap;

public abstract class Red {

	protected HashMap<String, Computadora> computadoras = new HashMap<>();
	

	public HashMap<String, Computadora> getComputadoras() {
		return computadoras;
	}

	public void setComputadoras(HashMap<String, Computadora> computadoras) {
		this.computadoras = computadoras;
	}

	
	public void enviarPaquete(String Mensaje, String ip) {
		
		
		
	}
	
	public Boolean agregarComputadora(Computadora c) {
		String ip = generarIp();
		if (c.getConectado()) {
		
			computadoras.put(ip, c);
			
		}
		else {
			System.out.println("La computadora no esta conectada a un IP");
		}
	
		return computadoras.containsValue(ip);
	
	}
	
	public String generarIp() {
		
		String ip = "192.168.0.";
		
		return ip;
	}
	
	public String consultarIp(Computadora c) {
		
		return null;
	}
	
	public String obtenerComputadora(String ip) {
		
		
		
		//return computadoras.get(ip);
		return null;
	}
	
	public void listarEstadosRed () {
		
	}

	
	
}
