package com.alumne.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.CardLayout;
import javax.swing.JSeparator;
import java.awt.Cursor;

public class Dashboard2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;

	final static String DASHBOARDPANEL = "Panell de benvinguda";
	final static String USERSPANEL = "Panell d'usuaris";
	final static String MACHINESPANEL = "Panell de maquines";
	final static String MATERIALSPANEL = "Panell de materials";
	final static String PROPOSALSPANEL = "Panell de propostes";
	final static String PROJECTSPANEL = "Panell de projectes";
	final static String INCIDENTSPANEL = "Panell de incidencies";
	final static String INVOICESPANEL = "Panell de factures";
	final static String MESSAGESPANEL = "Panell de missatges";
	final static String RESERVATIONSPANEL = "Panell de reserves";
	final static String TASKSPANEL = "Panell de tasques";
	final static String RESOURCESPANEL = "Panell de recursos";
	final static String DOCUMENTSPANEL = "Panell de documents";

	final static String TESTPANEL = "Panell de prova";

	DashboardPanel dashboardPanel = new DashboardPanel();
	//	UsersPanel usersPanel = new UsersPanel();
	MachinesPanel machinesPanel = new MachinesPanel();
	//	MaterialsPanel materialsPanel = new MaterialsPanel();
	//	ProposalsPanel proposalsPanel = new ProposalsPanel();
	ProjectsPanel projectsPanel = new ProjectsPanel();
	//	IncidentsPanel incidentsPanel = new IncidentsPanel();
	//	InvoicesPanel invoicesPanel = new InvoicesPanel();
	//	MessagesPanel messagesPanel = new MessagesPanel();
	ReservationsPanel reservationsPanel = new ReservationsPanel();
	//	TasksPanel tasksPanel = new TasksPanel();
	//	ResourcesPanel resourcesPanel = new ResourcesPanel();
	//	DocumentsPanel documentsPanel = new DocumentsPanel();

	TestPanel testPanel = new TestPanel();

	/**
	 * Create the frame.
	 */
	public Dashboard2() {
		setResizable(false);
		setTitle("Client SQL - Initlab");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(28,27,52));
		panel.setBounds(0, 0, 200, 563);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Dashboard2.class.getResource("/com/alumne/images/LogoBlau1_2.png")));
		logo.setBounds(40, 25, 118, 50);
		panel.add(logo);


		JLabel logoutBtn = new JLabel("Tancar sessió");
		logoutBtn.setIcon(new ImageIcon(Dashboard2.class.getResource("/com/alumne/images/logout-24.png")));
		logoutBtn.setBounds(12, 527, 119, 24);
		panel.add(logoutBtn);
		logoutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login login = new Login();
				login.setVisible(true);
				login.setLocationRelativeTo(null);
				dispose();
			}
		});

		logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		logoutBtn.setForeground(Color.WHITE);
		logoutBtn.setFont(new Font("Open Sans", Font.PLAIN, 14));
		logoutBtn.setHorizontalAlignment(SwingConstants.RIGHT);

		//PANELL DEL CARDLAYOUT, te que anar abans de usar panells
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(200, 0, 760, 563);
		contentPane.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		//BOTONS SIDEBAR
		JLabel btnToUsers = new JLabel("Usuaris");
		btnToUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToUsers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToUsers.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToUsers.setForeground(Color.WHITE);
		btnToUsers.setBounds(29, 123, 142, 23);
		panel.add(btnToUsers);

		JSeparator btnToUsersSprtr = new JSeparator();
		btnToUsersSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToUsersSprtr.setToolTipText("");
		btnToUsersSprtr.setBackground(Color.WHITE);
		btnToUsersSprtr.setForeground(Color.WHITE);
		btnToUsersSprtr.setBounds(29, 145, 142, 1);
		panel.add(btnToUsersSprtr);


		JLabel btnToMaquines = new JLabel("Maquines");
		btnToMaquines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, MACHINESPANEL);
			}
		});
		btnToMaquines.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToMaquines.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToMaquines.setForeground(Color.WHITE);
		btnToMaquines.setBounds(29, 151, 142, 23);
		panel.add(btnToMaquines);

		JSeparator btnToMachinesSprtr = new JSeparator();
		btnToMachinesSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToMachinesSprtr.setToolTipText("");
		btnToMachinesSprtr.setBackground(Color.WHITE);
		btnToMachinesSprtr.setForeground(Color.WHITE);
		btnToMachinesSprtr.setBounds(29, 173, 142, 1);
		panel.add(btnToMachinesSprtr);


		JLabel btnToMaterials = new JLabel("Materials");
		btnToMaterials.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToMaterials.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToMaterials.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToMaterials.setForeground(Color.WHITE);
		btnToMaterials.setBounds(29, 179, 142, 23);
		panel.add(btnToMaterials);

		JSeparator btnToMaterialsSprtr = new JSeparator();
		btnToMaterialsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToMaterialsSprtr.setToolTipText("");
		btnToMaterialsSprtr.setBackground(Color.WHITE);
		btnToMaterialsSprtr.setForeground(Color.WHITE);
		btnToMaterialsSprtr.setBounds(29, 201, 142, 1);
		panel.add(btnToMaterialsSprtr);


		JLabel btnToProposals = new JLabel("Propostes");
		btnToProposals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToProposals.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToProposals.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToProposals.setForeground(Color.WHITE);
		btnToProposals.setBounds(29, 207, 142, 23);
		panel.add(btnToProposals);

		JSeparator btnToProposalsSprtr = new JSeparator();
		btnToProposalsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToProposalsSprtr.setToolTipText("");
		btnToProposalsSprtr.setBackground(Color.WHITE);
		btnToProposalsSprtr.setForeground(Color.WHITE);
		btnToProposalsSprtr.setBounds(29, 229, 142, 1);
		panel.add(btnToProposalsSprtr);


		JLabel btnToProjects = new JLabel("Projectes");
		btnToProjects.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, PROJECTSPANEL);
			}
		});
		btnToProjects.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToProjects.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToProjects.setForeground(Color.WHITE);
		btnToProjects.setBounds(29, 235, 142, 23);
		panel.add(btnToProjects);

		JSeparator btnToProjectsSprtr = new JSeparator();
		btnToProjectsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToProjectsSprtr.setToolTipText("");
		btnToProjectsSprtr.setBackground(Color.WHITE);
		btnToProjectsSprtr.setForeground(Color.WHITE);
		btnToProjectsSprtr.setBounds(29, 257, 142, 1);
		panel.add(btnToProjectsSprtr);


		JLabel btnToIncidents = new JLabel("Incidencies");
		btnToIncidents.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToIncidents.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToIncidents.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToIncidents.setForeground(Color.WHITE);
		btnToIncidents.setBounds(29, 263, 142, 23);
		panel.add(btnToIncidents);

		JSeparator btnToIncidentsSprtr = new JSeparator();
		btnToIncidentsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToIncidentsSprtr.setToolTipText("");
		btnToIncidentsSprtr.setBackground(Color.WHITE);
		btnToIncidentsSprtr.setForeground(Color.WHITE);
		btnToIncidentsSprtr.setBounds(29, 285, 142, 1);
		panel.add(btnToIncidentsSprtr);


		JLabel btnToInvoices = new JLabel("Factures");
		btnToInvoices.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToInvoices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToInvoices.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToInvoices.setForeground(Color.WHITE);
		btnToInvoices.setBounds(29, 291, 142, 23);
		panel.add(btnToInvoices);

		JSeparator btnToInvoicesSprtr = new JSeparator();
		btnToInvoicesSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToInvoicesSprtr.setToolTipText("");
		btnToInvoicesSprtr.setBackground(Color.WHITE);
		btnToInvoicesSprtr.setForeground(Color.WHITE);
		btnToInvoicesSprtr.setBounds(29, 313, 142, 1);
		panel.add(btnToInvoicesSprtr);


		JLabel btnToReservations = new JLabel("Reserves");
		btnToReservations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, RESERVATIONSPANEL);
			}
		});
		btnToReservations.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToReservations.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToReservations.setForeground(Color.WHITE);
		btnToReservations.setBounds(29, 319, 142, 23);
		panel.add(btnToReservations);

		JSeparator btnToReservationsSprtr = new JSeparator();
		btnToReservationsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToReservationsSprtr.setToolTipText("");
		btnToReservationsSprtr.setBackground(Color.WHITE);
		btnToReservationsSprtr.setForeground(Color.WHITE);
		btnToReservationsSprtr.setBounds(29, 341, 142, 1);
		panel.add(btnToReservationsSprtr);


		JLabel btnToTasks = new JLabel("Tasques");
		btnToTasks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToTasks.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToTasks.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToTasks.setForeground(Color.WHITE);
		btnToTasks.setBounds(29, 347, 142, 23);
		panel.add(btnToTasks);

		JSeparator btnToTasksSprtr = new JSeparator();
		btnToTasksSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToTasksSprtr.setToolTipText("");
		btnToTasksSprtr.setBackground(Color.WHITE);
		btnToTasksSprtr.setForeground(Color.WHITE);
		btnToTasksSprtr.setBounds(29, 369, 142, 1);
		panel.add(btnToTasksSprtr);


		JLabel btnToResources = new JLabel("Recursos");
		btnToResources.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToResources.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToResources.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToResources.setForeground(Color.WHITE);
		btnToResources.setBounds(29, 375, 142, 23);
		panel.add(btnToResources);

		JSeparator btnToResourcesSprtr = new JSeparator();
		btnToResourcesSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToResourcesSprtr.setToolTipText("");
		btnToResourcesSprtr.setBackground(Color.WHITE);
		btnToResourcesSprtr.setForeground(Color.WHITE);
		btnToResourcesSprtr.setBounds(29, 397, 142, 1);
		panel.add(btnToResourcesSprtr);


		JLabel btnToDocuments = new JLabel("Documents");
		btnToDocuments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToDocuments.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToDocuments.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToDocuments.setForeground(Color.WHITE);
		btnToDocuments.setBounds(29, 403, 142, 23);
		panel.add(btnToDocuments);

		JSeparator btnToDocumentsSprtr = new JSeparator();
		btnToDocumentsSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToDocumentsSprtr.setToolTipText("");
		btnToDocumentsSprtr.setBackground(Color.WHITE);
		btnToDocumentsSprtr.setForeground(Color.WHITE);
		btnToDocumentsSprtr.setBounds(29, 425, 142, 1);
		panel.add(btnToDocumentsSprtr);


		JLabel btnToMessages = new JLabel("Missatges");
		btnToMessages.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, TESTPANEL);
			}
		});
		btnToMessages.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToMessages.setFont(new Font("Open Sans", Font.PLAIN, 16));
		btnToMessages.setForeground(Color.WHITE);
		btnToMessages.setBounds(29, 431, 142, 23);
		panel.add(btnToMessages);

		JSeparator btnToMessagesSprtr = new JSeparator();
		btnToMessagesSprtr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnToMessagesSprtr.setToolTipText("");
		btnToMessagesSprtr.setBackground(Color.WHITE);
		btnToMessagesSprtr.setForeground(Color.WHITE);
		btnToMessagesSprtr.setBounds(29, 453, 142, 1);
		panel.add(btnToMessagesSprtr);


		//ACCES A BOTONS
		panel_2.add(dashboardPanel, DASHBOARDPANEL);
		//		panel_2.add(usersPanel, USERSPANEL);
		panel_2.add(machinesPanel, MACHINESPANEL);
		//		panel_2.add(materialsPanel, MATERIALSPANEL);
		//		panel_2.add(proposalsPanel, PROPOSALSPANEL);
		panel_2.add(projectsPanel, PROJECTSPANEL);
		//		panel_2.add(incidentsPanel, INCIDENTSPANEL);
		//		panel_2.add(invoicesPanel, INVOICESPANEL);
		//		panel_2.add(messagesPanel, MESSAGESPANEL);
		panel_2.add(reservationsPanel, RESERVATIONSPANEL);
		//		panel_2.add(tasksPanel, TASKSPANEL);
		//		panel_2.add(resourcesPanel, RESOURCESPANEL);
		//		panel_2.add(documentsPanel, DOCUMENTSPANEL);

		panel_2.add(testPanel, TESTPANEL);

		//BOTONS DEL DASHBOARD
		dashboardPanel.btnToMachines.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, MACHINESPANEL);
			}

			@Override public void mousePressed(MouseEvent e) {dashboardPanel.btnToMachines.setBackground(Color.DARK_GRAY);}		
			@Override public void mouseEntered(MouseEvent e) {dashboardPanel.btnToMachines.setBackground(Color.GRAY);}
			@Override public void mouseExited(MouseEvent e) {dashboardPanel.btnToMachines.setBackground(new Color(200, 201, 203));}
		});

		//BOTONS DEL ALTRES PANELS	
		machinesPanel.btnToDashboard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, DASHBOARDPANEL);
			}

			@Override public void mousePressed(MouseEvent e) {machinesPanel.btnToDashboard.setBackground(Color.GRAY);}
			@Override public void mouseEntered(MouseEvent e) {machinesPanel.btnToDashboard.setBackground(Color.LIGHT_GRAY);}
			@Override public void mouseExited(MouseEvent e) {machinesPanel.btnToDashboard.setBackground(Color.WHITE);}
		});

		projectsPanel.btnToDashboard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, DASHBOARDPANEL);
			}

			@Override public void mousePressed(MouseEvent e) {projectsPanel.btnToDashboard.setBackground(Color.GRAY);}
			@Override public void mouseEntered(MouseEvent e) {projectsPanel.btnToDashboard.setBackground(Color.LIGHT_GRAY);}
			@Override public void mouseExited(MouseEvent e) {projectsPanel.btnToDashboard.setBackground(Color.WHITE);}
		});

		reservationsPanel.btnToDashboard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CardLayout c1 = (CardLayout)(panel_2.getLayout());
				c1.show(panel_2, DASHBOARDPANEL);
			}

			@Override public void mousePressed(MouseEvent e) {reservationsPanel.btnToDashboard.setBackground(Color.GRAY);}
			@Override public void mouseEntered(MouseEvent e) {reservationsPanel.btnToDashboard.setBackground(Color.LIGHT_GRAY);}
			@Override public void mouseExited(MouseEvent e) {reservationsPanel.btnToDashboard.setBackground(Color.WHITE);}
		});
	}
}
