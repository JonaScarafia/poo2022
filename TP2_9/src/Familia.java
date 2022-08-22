import java.util.ArrayList;

public class Familia {

	private String Apellido, direccion;
	private ArrayList<Persona> integrantes;
	private int cantidad;

	public Familia(String apellido, String direccion, ArrayList<Persona> integrantes, int cantidad) {
		super();
		Apellido = apellido;
		this.direccion = direccion;
		this.integrantes = integrantes;
		this.cantidad = cantidad;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void agregarIntegrante(Persona integrantes) {

		getIntegrantes().add(integrantes);

	}

	public void mostrarIntegrantes( String apellido) {

		System.out.println("Los integrantes de la familia " +  apellido +" son: " +"\n");

		for ( Persona persona: integrantes) {

			System.out.println(persona.informationPerson());


		}
		System.out.println("\n");

	}


	public String toString() {
		return "Familia = " + Apellido + "\n" +" Direccion= "+ direccion + "\n"+ "Cantidad= " + cantidad + "\n";
	}



}
