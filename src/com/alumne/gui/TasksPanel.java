package com.alumne.gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;

public class TasksPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public JPanel btnToDashboard;
	
	/**
	 * Create the panel.
	 */
	public TasksPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 760, 563);
		add(panel);
		panel.setLayout(null);
		
		btnToDashboard = new JPanel();
		btnToDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToDashboard.setBackground(Color.WHITE);
		btnToDashboard.setBounds(13, 12, 138, 34);
		panel.add(btnToDashboard);
		
		JLabel btnToDashboardTxt = new JLabel("Tornar a l'inici");
		btnToDashboardTxt.setIcon(new ImageIcon(TasksPanel.class.getResource("/com/alumne/images/left-chevron.png")));
		btnToDashboardTxt.setForeground(Color.BLACK);
		btnToDashboardTxt.setFont(new Font("Open Sans", Font.PLAIN, 15));
		btnToDashboard.add(btnToDashboardTxt);
		
		JLabel title = new JLabel("Tasques");
		title.setFont(new Font("Open Sans", Font.BOLD, 20));
		title.setBounds(26, 58, 96, 28);
		panel.add(title);
						
	}
}
