import javax.swing.JOptionPane;

public class MainPuntoB {

	public static void main(String[] args) {
		
		String messageUser;
		
		messageUser = JOptionPane.showInputDialog("Ingrese un Dialogo por favor: ");
		
		
		JOptionPane.showMessageDialog(null, "Tu mensaje es: "+ messageUser);
	}

}
