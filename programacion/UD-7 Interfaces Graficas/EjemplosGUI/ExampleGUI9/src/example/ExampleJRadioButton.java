package example;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ExampleJRadioButton extends JFrame {

	public ExampleJRadioButton() {
		super("Prueba de radiobutton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JRadioButton botonHombre = new JRadioButton("Hombre", true);
		JRadioButton botonMujer = new JRadioButton("Mujer", false);

		JRadioButton botonCasado = new JRadioButton("Casado", true);
		JRadioButton botonSoltero = new JRadioButton("Soltero", false);

		add(botonHombre);
		add(botonMujer);
		add(botonCasado);
		add(botonSoltero);

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(botonHombre);
		grupo1.add(botonMujer);
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(botonCasado);
		grupo2.add(botonSoltero);

		ManejadorRadioButton manejador = new ManejadorRadioButton();
		botonHombre.addItemListener(manejador);
		botonMujer.addItemListener(manejador);
		botonCasado.addItemListener(manejador);
		botonSoltero.addItemListener(manejador);

		setVisible(true);
	}

	private class ManejadorRadioButton implements ItemListener {
		public void itemStateChanged(ItemEvent evento) {
			JRadioButton modificado = (JRadioButton) evento.getSource();
			modificado = (JRadioButton) evento.getItem();
			String texto = modificado.getText();
			System.out.println(texto);
			int estado = evento.getStateChange();
			boolean marcado = modificado.isSelected();
		}

	}

}
