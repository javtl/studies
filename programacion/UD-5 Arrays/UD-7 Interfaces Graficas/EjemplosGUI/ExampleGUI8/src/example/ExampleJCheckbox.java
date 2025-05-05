package example;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ExampleJCheckbox extends JFrame {

	public ExampleJCheckbox() {
		super("Prueba de checkbox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JCheckBox envolver = new JCheckBox("Envolver Regalo", true);
		JCheckBox express = new JCheckBox("Envío Express");
		add(envolver);
		add(express);

		ManejadorCheckBox manejador = new ManejadorCheckBox();
		envolver.addItemListener(manejador);
		express.addItemListener(manejador);

		setVisible(true);
	}

	private class ManejadorCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent evento) {
			JCheckBox clickeado = (JCheckBox) evento.getSource();
			clickeado = (JCheckBox) evento.getItem();
			String texto = clickeado.getText();
			System.out.println(texto);
			int estado = evento.getStateChange();
			boolean marcado = clickeado.isSelected();
		}

	}

}
