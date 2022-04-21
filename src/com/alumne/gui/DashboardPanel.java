package com.alumne.gui;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;

public class DashboardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public JPanel btnToUsers;
	public JPanel btnToMachines;
	public JPanel btnToMaterials;
	public JPanel btnToProposals;
	public JPanel btnToProjects;
	public JPanel btnToIncidents;
	public JPanel btnToInvoices;
	public JPanel btnToMessages;
	public JPanel btnToReservations;
	public JPanel btnToTasks;
	public JPanel btnToResources;
	public JPanel btnToDocuments;

	/**
	 * Create the panel.
	 */
	public DashboardPanel() {
		setLayout(null);

		JPanel panel = 	new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 760, 563);
		add(panel);
		panel.setLayout(null);

		//USERS
		btnToUsers = new JPanel();
		btnToUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToUsers.setBackground(new Color(200, 201, 203));
		btnToUsers.setBounds(26, 147, 120, 80);
		btnToUsers.setLayout(null);
		panel.add(btnToUsers);

		JLabel btnToUsersTxt = new JLabel("Usuaris");
		btnToUsersTxt.setBounds(26, 27, 68, 26);
		btnToUsersTxt.setForeground(Color.BLACK);
		btnToUsersTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToUsers.add(btnToUsersTxt);

		//MACHINES
		btnToMachines = new JPanel();
		btnToMachines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToMachines.setBackground(new Color(200, 201, 203));
		btnToMachines.setBounds(172, 147, 120, 80);
		btnToMachines.setLayout(null);
		panel.add(btnToMachines);

		JLabel btnToMachinesTxt = new JLabel("Màquines");
		btnToMachinesTxt.setBounds(16, 27, 88, 26);
		btnToMachinesTxt.setForeground(Color.BLACK);
		btnToMachinesTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToMachines.add(btnToMachinesTxt);

		//MATERIALS
		btnToMaterials = new JPanel();
		btnToMaterials.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToMaterials.setBackground(new Color(200, 201, 203));
		btnToMaterials.setBounds(318, 147, 120, 80);
		btnToMaterials.setLayout(null);
		panel.add(btnToMaterials);

		JLabel btnToMaterialsTxt = new JLabel("Materials");
		btnToMaterialsTxt.setBounds(18, 27, 83, 26);
		btnToMaterialsTxt.setForeground(Color.BLACK);
		btnToMaterialsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToMaterials.add(btnToMaterialsTxt);

		//PROPOSALS
		btnToProposals = new JPanel();
		btnToProposals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToProposals.setBackground(new Color(200, 201, 203));
		btnToProposals.setBounds(464, 147, 120, 80);
		btnToProposals.setLayout(null);
		panel.add(btnToProposals);

		JLabel btnToProposalsTxt = new JLabel("Propostes");
		btnToProposalsTxt.setForeground(Color.BLACK);
		btnToProposalsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToProposalsTxt.setBounds(15, 27, 90, 26);
		btnToProposals.add(btnToProposalsTxt);

		//PROJECTS
		btnToProjects = new JPanel();
		btnToProjects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToProjects.setBackground(new Color(200, 201, 203));
		btnToProjects.setBounds(610, 147, 120, 80);
		btnToProjects.setLayout(null);
		panel.add(btnToProjects);

		JLabel btnToProjectsTxt = new JLabel("Projectes");
		btnToProjectsTxt.setForeground(Color.BLACK);
		btnToProjectsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToProjectsTxt.setBounds(18, 27, 83, 26);
		btnToProjects.add(btnToProjectsTxt);

		//INCIDENTS
		btnToIncidents = new JPanel();
		btnToIncidents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToIncidents.setBackground(new Color(200, 201, 203));
		btnToIncidents.setBounds(26, 250, 120, 80);
		btnToIncidents.setLayout(null);
		panel.add(btnToIncidents);

		JLabel btnToIncidentsTxt = new JLabel("Incidències");
		btnToIncidentsTxt.setForeground(Color.BLACK);
		btnToIncidentsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToIncidentsTxt.setBounds(9, 27, 101, 26);
		btnToIncidents.add(btnToIncidentsTxt);

		//INVOICES
		btnToInvoices = new JPanel();
		btnToInvoices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToInvoices.setBackground(new Color(200, 201, 203));
		btnToInvoices.setBounds(172, 250, 120, 80);
		btnToInvoices.setLayout(null);
		panel.add(btnToInvoices);

		JLabel btnToInvoicesTxt = new JLabel("Factures");
		btnToInvoicesTxt.setForeground(Color.BLACK);
		btnToInvoicesTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToInvoicesTxt.setBounds(22, 27, 76, 26);
		btnToInvoices.add(btnToInvoicesTxt);

		//MESSAGES
		btnToMessages = new JPanel();
		btnToMessages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToMessages.setBackground(new Color(200, 201, 203));
		btnToMessages.setBounds(318, 250, 120, 80);
		btnToMessages.setLayout(null);
		panel.add(btnToMessages);

		JLabel btnToMessagesTxt = new JLabel("Missatges");
		btnToMessagesTxt.setForeground(Color.BLACK);
		btnToMessagesTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToMessagesTxt.setBounds(15, 27, 89, 26);
		btnToMessages.add(btnToMessagesTxt);

		//RESERVATIONS
		btnToReservations = new JPanel();
		btnToReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToReservations.setBackground(new Color(200, 201, 203));
		btnToReservations.setBounds(464, 250, 120, 80);
		btnToReservations.setLayout(null);
		panel.add(btnToReservations);

		JLabel btnToReservationsTxt = new JLabel("Reserves");
		btnToReservationsTxt.setForeground(Color.BLACK);
		btnToReservationsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToReservationsTxt.setBounds(20, 27, 80, 26);
		btnToReservations.add(btnToReservationsTxt);

		//TASKS
		btnToTasks = new JPanel();
		btnToTasks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToTasks.setBackground(new Color(200, 201, 203));
		btnToTasks.setBounds(610, 250, 120, 80);
		btnToTasks.setLayout(null);
		panel.add(btnToTasks);

		JLabel btnToTasksTxt = new JLabel("Tasques");
		btnToTasksTxt.setForeground(Color.BLACK);
		btnToTasksTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToTasksTxt.setBounds(23, 27, 74, 26);
		btnToTasks.add(btnToTasksTxt);

		//RESOURCES
		btnToResources = new JPanel();
		btnToResources.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToResources.setBackground(new Color(200, 201, 203));
		btnToResources.setBounds(244, 354, 120, 80);
		btnToResources.setLayout(null);
		panel.add(btnToResources);

		JLabel btnToResourcesTxt = new JLabel("Recursos");
		btnToResourcesTxt.setForeground(Color.BLACK);
		btnToResourcesTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToResourcesTxt.setBounds(19, 27, 82, 26);
		btnToResources.add(btnToResourcesTxt);

		//DOCUMENTS
		btnToDocuments = new JPanel();
		btnToDocuments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnToDocuments.setBackground(new Color(200, 201, 203));
		btnToDocuments.setBounds(390, 354, 120, 80);
		btnToDocuments.setLayout(null);
		panel.add(btnToDocuments);

		JLabel btnToDocumentsTxt = new JLabel("Documents");
		btnToDocumentsTxt.setForeground(Color.BLACK);
		btnToDocumentsTxt.setFont(new Font("Open Sans", Font.BOLD, 18));
		btnToDocumentsTxt.setBounds(9, 27, 102, 26);
		btnToDocuments.add(btnToDocumentsTxt);

		//DEBUG
		JLabel lblTest = new JLabel("TEST");
		lblTest.setBounds(0, 0, 70, 15);
		panel.add(lblTest);

		JLabel lblNewLabel = new JLabel("TEST");
		lblNewLabel.setBounds(727, 548, 33, 15);
		panel.add(lblNewLabel);
	}
}