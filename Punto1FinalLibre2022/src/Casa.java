import java.util.ArrayList;

public class Casa {

	private String direccion;
	private Integer habitaciones;
	private String ba�os;
	private String patioFrontal;
	private String patioTrasero;

	private Familia familia;

	public Casa(String direccion, Integer habitaciones, String ba�os, String patioFrontal, Familia familia) {

		this.direccion = direccion;
		this.habitaciones = 2;
		this.ba�os = "Un Ba�o";
		this.patioFrontal = "Un patio Frontal";
		this.familia = familia;
	}

//	public Casa(String direccion, Integer habitaciones, String ba�os, String patioFrontal, Familia familia) {
//		
//		this.direccion = direccion;
//		this.habitaciones = 3;
//		this.ba�os = "Un ba�o";
//		this.patioFrontal = "Un ba�o Frontal";
//		this.familia = familia;
//	}

	public Casa(String direccion, Integer habitaciones, String ba�os, String patioFrontal, String patioTrasero,
			Familia familia) {
		
		this.direccion = direccion;
		this.habitaciones = 4;
		this.ba�os ="Dos Ba�os";
		this.patioFrontal = "Un Patio Frontal";
		this.patioTrasero = "Un Patio Trasero";
		this.familia = familia;
	}
	
	
	
	

}
