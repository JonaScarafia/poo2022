import java.util.ArrayList;

public abstract class TipoCaja {

	protected String tipoBebida;
	protected Integer precioCaja; //no tiene sentido por que lo puedo calcular con los precios de las botellas
	protected Integer limiteAcopio;
	protected ArrayList<Bebida> cajaBebidas = new ArrayList<>();
	protected ArrayList<Bebida> listaCajas = new ArrayList<>(); //Mal

	public TipoCaja(String tipoBebida, Integer limiteAcopio) {

		this.tipoBebida = tipoBebida; //Mal
		this.limiteAcopio = limiteAcopio; //Mal  debería estar en una clase almacen 

	}

	abstract ArrayList<Bebida> empaquetarBebida(Bebida bebida); //Porque devolves una lista de bebidas si ya la tenes como atributo 
	//no tiene sentido que cada vez que empaquete una bebida me devuelva una lista de bebidas
	//

	abstract void chequeoCantidadCaja(ArrayList<Bebida> cajaBebidas); //Mal porque crear un metodo cuando es preguntarle al arreglo el size

	public ArrayList<Bebida> creoCaja() {
		System.out.println("Se creo una Nueva Caja");
		return this.cajaBebidas;

	}//Porque crear una caja si para eso esta el constructor 
	//No tiene sentido deberoia crear un objeto 

	public ArrayList<Bebida> guardoCajas(ArrayList<Bebida> cajaBebidas) {

		listaCajas.addAll(cajaBebidas);

		return listaCajas;
	}//Seria mejor tenerlo en otro lado
	//acá estaría rompiendo el single responsability

	public void mostrarcajas() {

//		for (Bebida bebida : cajaBebidas) {
//			System.out.println(bebida.toString());
//		}
		
		for (Bebida cajBebidas : listaCajas) {
			
			System.out.println(cajBebidas.toString());
		
		}
		
	}

	public String toString() {
		return "La caja tiene bebidas , limite por caja " + limiteAcopio+" Botellas" + " Bebidas en caja "+ "\n";
	}//Esto se podria reutilizar en las clases hijas
}
