package example;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ExampleJCombobox extends JFrame {

	public ExampleJCombobox() {
		super("Prueba de combobox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		String[] provincias = { "Cádiz", "Sevilla", "Huelva", "Málaga", "Córdoba " };
		JComboBox comboProvincias = new JComboBox(provincias);
		comboProvincias.setMaximumRowCount(3);
		comboProvincias.setSelectedIndex(2);
		comboProvincias.setSelectedItem("Huelva");
		add(comboProvincias);
		comboProvincias.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evento) {
				JComboBox combo = (JComboBox) evento.getSource();
				String item = (String) evento.getItem();
				System.out.println(item);
				int estado = evento.getStateChange();
			}
		});

		setVisible(true);
	}

}
