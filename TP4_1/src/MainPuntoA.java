import javax.swing.JOptionPane;

public class MainPuntoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JOptionPane.showMessageDialog(new Vista() , "A basic JOptionPane message dialog");
		
		JOptionPane.showConfirmDialog(new Vista(), "¿Esta Seguro que quiere dar de baja al usuario?", "Punto 1 TP4", JOptionPane.OK_CANCEL_OPTION);
		//Suele ser el segundo de la opcion, leer descripción
		
	}

}
