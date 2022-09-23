import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaPunto2 extends JFrame {

	private JPanel contentPane;

	public VistaPunto2() {
		
		JFileChooser selecter = new JFileChooser();
		selecter.showOpenDialog(contentPane);
		File archive = selecter.getSelectedFile();
		System.out.println("El archivo seleccionado: " + archive);
		System.out.println("Path: " +selecter.getCurrentDirectory());
		
	}

}
