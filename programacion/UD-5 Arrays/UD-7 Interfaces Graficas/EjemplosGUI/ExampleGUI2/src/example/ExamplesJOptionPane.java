package example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ExamplesJOptionPane {

	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Bienvenido a GUI");
		
		JOptionPane.showMessageDialog(null, "Bienvenido a GUI",
				"Saludo",JOptionPane.WARNING_MESSAGE);
		
		String nombre=JOptionPane.showInputDialog("¿Cuál es su nombre?");
		JOptionPane.showMessageDialog(null, nombre.toUpperCase());
		
		nombre=JOptionPane.showInputDialog(null,"¿Cuál es su nombre?","Pregunta",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, nombre.toLowerCase());
		
	}

}
