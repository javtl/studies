package example;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExampleJFrame {

	public static void main(String[] args) {
		JFrame miMarco=new JFrame("Saludo");
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setSize(275,180);
		miMarco.setLocationRelativeTo(null);
	
		
		JLabel etiqueta1=new JLabel("Bienvenido mi I.G.");
		etiqueta1.setToolTipText("Esto es una etiqueta");
		miMarco.add(etiqueta1);
		miMarco.setVisible(true);

	}

}
