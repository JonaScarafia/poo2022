import java.util.ArrayList;

public class Casa {

	private String direccion;
	private Integer habitaciones;
	private String baños;
	private String patioFrontal;
	private String patioTrasero;

	private Familia familia;

	public Casa(String direccion, Integer habitaciones, String baños, String patioFrontal, Familia familia) {

		this.direccion = direccion;
		this.habitaciones = 2;
		this.baños = "Un Baño";
		this.patioFrontal = "Un patio Frontal";
		this.familia = familia;
	}

//	public Casa(String direccion, Integer habitaciones, String baños, String patioFrontal, Familia familia) {
//		
//		this.direccion = direccion;
//		this.habitaciones = 3;
//		this.baños = "Un baño";
//		this.patioFrontal = "Un baño Frontal";
//		this.familia = familia;
//	}

	public Casa(String direccion, Integer habitaciones, String baños, String patioFrontal, String patioTrasero,
			Familia familia) {
		
		this.direccion = direccion;
		this.habitaciones = 4;
		this.baños ="Dos Baños";
		this.patioFrontal = "Un Patio Frontal";
		this.patioTrasero = "Un Patio Trasero";
		this.familia = familia;
	}
	
	
	
	

}
