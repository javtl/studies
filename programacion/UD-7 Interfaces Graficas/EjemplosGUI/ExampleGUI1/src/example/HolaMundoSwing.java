package example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class HolaMundoSwing {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Ventana Hola Mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label=new JLabel("Hola Mundo");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
