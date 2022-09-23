
public class MainPunto3 {

	public static void main(String[] args) {
//seria mejor de lo mas abstracto por que no se estaria implementando interfaces de manera correcta
		Pizza pizza = new Pizza("Especial","Salado","Italia",2000.0,"redonda","Mediana","Don Nicola");
		Movil movil = new Movil("AL23","Alcatel","Fire ",297444444,"Argentina" );

		Pizza pizza2 = new Pizza("Hawaiana","Agridulce","Nueva York",2500.0,"redonda","Grande","La Toscana");
		Movil movil2 = new Movil("XX","Iphone","Cosmico",297488888,"Argentina" );

		System.out.println("Muestra de herencia multiple utilizando interfaces ;) \n");

		System.out.println(pizza.enviar());
		System.out.println(pizza.recibir());
		System.out.println(pizza.tiempo()+"\n");

		System.out.println(movil.enviar());
		System.out.println(movil.recibir());
		System.out.println(movil.tiempo()+"\n");

		System.out.println(pizza2.enviar());
		System.out.println(pizza2.recibir());
		System.out.println(pizza2.tiempo()+"\n");

		System.out.println(movil2.enviar());
		System.out.println(movil2.recibir());
		System.out.println(movil2.tiempo()+"\n");


	}

}
