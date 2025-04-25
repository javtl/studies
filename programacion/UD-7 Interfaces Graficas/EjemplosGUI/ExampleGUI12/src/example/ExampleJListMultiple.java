package example;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExampleJListMultiple extends JFrame {

	public ExampleJListMultiple() {
		super("Prueba de list con múltiples valores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		String[] nombresColores = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Magenta" };
		JList jListColores = new JList(); 
		jListColores.setListData( nombresColores ); 
		jListColores.setVisibleRowCount( 5 ); 
		jListColores.setSelectedIndex( 1  ); 
		jListColores.setFixedCellWidth( 100 );
		jListColores.setFixedCellHeight( 15 ); 
		jListColores.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION ) ;
		add( new JScrollPane( jListColores ) );

		jListColores.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent evento) {
				JList lista = (JList) evento.getSource();
				int seleccionado = lista.getSelectedIndex();
			}
		});

		setVisible(true);
	}

}
