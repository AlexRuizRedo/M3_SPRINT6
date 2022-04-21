package com.alumne.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField userTxt;
	private JPasswordField passTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/com/alumne/images/LogoBlau1_3.png")));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(28,27,52));
		panel.setBounds(300, 0, 200, 325);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(41, 125, 118, 50);
		panel.add(logo);
		logo.setIcon(new ImageIcon(Login.class.getResource("/com/alumne/images/LogoBlau1_2.png")));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel title = new JLabel("Iniciar sessió");
		title.setFont(new Font("Open Sans", Font.BOLD, 24));
		title.setBounds(44, 42, 151, 33);
		contentPane.add(title);
		
		JLabel userLabel = new JLabel("Usuari");
		userLabel.setFont(new Font("Open Sans", Font.PLAIN, 15));
		userLabel.setBounds(44, 87, 70, 15);
		contentPane.add(userLabel);
		
		userTxt = new JTextField();
		userTxt.setFont(new Font("Open Sans", Font.PLAIN, 12));
		userTxt.setBounds(44, 112, 151, 20);
		contentPane.add(userTxt);
		userTxt.setColumns(10);
		
		JLabel passLabel = new JLabel("Contrasenya");
		passLabel.setFont(new Font("Open Sans", Font.PLAIN, 15));
		passLabel.setBounds(44, 143, 121, 33);
		contentPane.add(passLabel);
		
		passTxt = new JPasswordField();
		passTxt.setFont(new Font("Dialog", Font.PLAIN, 12));
		passTxt.setBounds(44, 175, 151, 20);
		contentPane.add(passTxt);
		
		JCheckBox showPassCheckBox = new JCheckBox("Mostrar contraseña");
		showPassCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showPassCheckBox.isSelected()) {
					passTxt.setEchoChar((char)0);
				}else {
					passTxt.setEchoChar('•');
				}
			}
		});
		showPassCheckBox.setForeground(Color.LIGHT_GRAY);
		showPassCheckBox.setFont(new Font("Open Sans", Font.PLAIN, 12));
		showPassCheckBox.setBackground(Color.WHITE);
		showPassCheckBox.setBounds(40, 195, 155, 23);
		contentPane.add(showPassCheckBox);

		JPanel loginBtn = new JPanel();
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashboard dashboard = new Dashboard();
				dashboard.setVisible(true);
				dashboard.setLocationRelativeTo(null);
				dispose();
			}
			
			@Override public void mousePressed(MouseEvent e) {loginBtn.setBackground(new Color(190, 129, 2));}
			@Override public void mouseEntered(MouseEvent e) {loginBtn.setBackground(new Color(233, 129, 2));}
			@Override public void mouseExited(MouseEvent e) {loginBtn.setBackground(new Color(255, 140, 0));}

		});
		
		loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		loginBtn.setBackground(new Color(255,140,0));
		loginBtn.setBounds(44, 225, 100, 30);
		contentPane.add(loginBtn);
		
		JLabel loginBtnTxt = new JLabel("Entrar");
		loginBtnTxt.setForeground(Color.WHITE);
		loginBtnTxt.setFont(new Font("Open Sans", Font.BOLD, 15));
		loginBtn.add(loginBtnTxt);
	}
}
