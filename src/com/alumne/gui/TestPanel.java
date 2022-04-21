package com.alumne.gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class TestPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 760, 563);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 548, 70, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(690, 0, 70, 15);
		panel.add(lblNewLabel_1);

	}
}
