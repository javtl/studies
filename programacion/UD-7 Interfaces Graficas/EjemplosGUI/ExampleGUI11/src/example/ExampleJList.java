package example;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExampleJList extends JFrame {

	public ExampleJList() {
		super("Prueba de list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		String[] nombresColores = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Magenta" };
		JList jListColores = new JList(nombresColores);
		jListColores.setVisibleRowCount(5);
		jListColores.setSelectedIndex(1);
		jListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(jListColores));
		jListColores.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent evento) {
				JList lista = (JList) evento.getSource();
				int seleccionado = lista.getSelectedIndex();
			}
		});

		setVisible(true);
	}

}
