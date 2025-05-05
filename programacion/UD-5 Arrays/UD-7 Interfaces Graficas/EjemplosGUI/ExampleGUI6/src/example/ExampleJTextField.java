package example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExampleJTextField extends JFrame {

	private JTextField txtTexto1;
	public ExampleJTextField()
	{
		super("Felicitación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		txtTexto1 = new JTextField( 15 );
		ManejadorCampoTexto escuchador=new ManejadorCampoTexto();
	    txtTexto1.addActionListener(escuchador);
	    add(txtTexto1);
	    
	    setVisible(true);
		
		
	}
	
	private class ManejadorCampoTexto implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
				
			Object obj=ev.getSource();
			if(obj==txtTexto1)
			{	
				String texto=txtTexto1.getText();
				JOptionPane.showMessageDialog(ExampleJTextField.this, texto);
			}
		}
	}

}
