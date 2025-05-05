package example;

import java.awt.FlowLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ExampleJFrame extends JFrame {

	public ExampleJFrame()
	{
		super("Felicitación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750,600);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		Icon imagen=new ImageIcon("files/felicidad.png");
		
		JLabel label=new JLabel();
		label.setIcon(imagen);
		label.setText("Felicidad!");
		label.setHorizontalTextPosition(SwingConstants.RIGHT);
		
		add(label);
		setVisible(true);
	}

}
