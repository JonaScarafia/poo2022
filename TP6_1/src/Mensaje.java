
public class Mensaje implements Runnable {
	
	private Integer id;
	

	public Mensaje(Integer id) {
		
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	
	public void run() {
		
		try {
			Thread.sleep(getId()); // debería poner el tiempo que quiero que duerma
			
		} catch (Exception e) {
			
		} 
		
	}
}
