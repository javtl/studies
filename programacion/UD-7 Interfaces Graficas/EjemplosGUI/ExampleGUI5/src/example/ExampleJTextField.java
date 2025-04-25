package example;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExampleJTextField extends JFrame {

	public ExampleJTextField()
	{
		super("Felicitación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		JTextField campoTexto1 = new JTextField( 15 ); 
	    add(campoTexto1);
	      
	    campoTexto1.setText("Modificado por código");
	    System.out.println(campoTexto1.getText()); 
	       
	    JTextField campoTexto2 = new JTextField( "Escriba el texto en esta caja" );
	    add( campoTexto2 ); 

	    JTextField campoTexto3 = new JTextField( "Campo de texto no editable", 21 );
	    campoTexto3.setEditable( false ); 
	    add(campoTexto3);

	    JPasswordField campoContra = new JPasswordField( "Texto oculto" );
	    add(campoContra); 

		setVisible(true);
		
		
	}

}
