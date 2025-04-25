package example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExampleJButton extends JFrame {

	private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;

    public ExampleJButton() {
        super("Prueba de botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
        botonJButtonSimple = new JButton( "Boton simple" ); 
        add( botonJButtonSimple ); 
        Icon insecto1 = new ImageIcon( "files/insecto1.jpg") ;
        Icon insecto2 = new ImageIcon( "files/insecto2.jpg") ;
        botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); 
        botonJButtonElegante.setRolloverIcon( insecto2 ); 
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonSimple.addActionListener( manejador );
        botonJButtonElegante.addActionListener( manejador ); 

        add( botonJButtonElegante );
        setVisible(true);
    } 
    
    private class ManejadorBoton implements ActionListener {
        public void actionPerformed( ActionEvent evento ) {
            String mensaje = String.format("Pulsaste el %s", evento.getActionCommand() );
            JOptionPane.showMessageDialog( ExampleJButton.this, mensaje);
        }
    } 


}
