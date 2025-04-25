package example;

import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ExampleOtherElements extends JFrame {

	public ExampleOtherElements() {
		super("Prueba de otros elementos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JSlider jSlider1 = new JSlider();
		jSlider1.setMaximum(200);
		jSlider1.setMinimum(10);
		jSlider1.setValue(67);

		add(new JScrollPane(jSlider1));

		jSlider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent evt) {
				System.out.println(jSlider1.getValue());
			}
		});

		JScrollBar jScrollBar2 = new JScrollBar();
		jScrollBar2.setOrientation(JScrollBar.HORIZONTAL);
		jScrollBar2.setBlockIncrement(5);
		jScrollBar2.setMaximum(200);
		jScrollBar2.setUnitIncrement(2);
		jScrollBar2.setValue(33);
		jScrollBar2.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent evt) {
				System.out.println(jScrollBar2.getValue());
			}
		});
		add(jScrollBar2);

		setVisible(true);
	}

}
