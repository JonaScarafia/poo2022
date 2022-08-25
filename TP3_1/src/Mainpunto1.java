
public class Mainpunto1 {

	public static void main(String[] args) {


	
		TelefonoFactura telefonoFactura = new TelefonoFactura(" MIA2","Xiaomi","Supernova ",297411111, 100.0, 0.0, 40.0);
	    TelefonoTarjeta telefonotarjeta = new TelefonoTarjeta("A29", "Samsung", "Galaxy", 297422222, 40, 0.5, 1.5, 0);
	    TelefonoFactura telefonoFactura2 = new TelefonoFactura(" XX","Iphone","Flama ",297433333, 500.0, 5.0, 4.0);
	    TelefonoTarjeta telefonotarjeta2 = new TelefonoTarjeta(" AL23","Alcatel","Fire ",297444444,50,15.5, 1.5, 0);
	    
	    System.out.println("Gastos generales de telefonos: \n");
	    
	    System.out.printf("%s %n %n  %s %n %n  %s %n %n  %s %n", telefonoFactura,telefonotarjeta,telefonoFactura2,telefonotarjeta2);
	}
		

	}
/*
 
Aca vemos un claro ejemplo de herencia original ya que es habitual el uso de telefonos celulares con factura o abono y con tarjetas recargables

El Telefono sería el Padre y los hijos serían Telefono Trjeta y telefono Factura, es un problema de la vida cotidiana por eso lo considero un ejemplo original

fuera de los casos comunes como animal o vehiculo


*/