//package com.javaproject;

//import java.awt.EventQueue;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JButton;
//import javax.swing.LayoutStyle.ComponentPlacement;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class AccountLogin extends JFrame {
//	static AccountLogin frame;
//	private JPanel contentPane;
//	private JTextField textFieldRollno;
//	private JPasswordField passwordField;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new AccountLogin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public AccountLogin() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//
//		JLabel lblAccountantLogin = new JLabel(" Account Login ");
//		lblAccountantLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		lblAccountantLogin.setForeground(Color.DARK_GRAY);
//
//		JLabel lblRollno = new JLabel("Roll No:");
//
//		textFieldRollno = new JTextField();
//		textFieldRollno.setColumns(10);
//
//		JLabel lblPassword = new JLabel("Password:");
//
//		passwordField = new JPasswordField();
//
//		JButton btnLogin = new JButton("Login");
//		btnLogin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				String rollnoStr = textFieldRollno.getText();
//				String password = String.valueOf(passwordField.getPassword());
//				try {
//					int rollno = Integer.parseInt(rollnoStr);
//					boolean status = AccountDao.validate(rollno, password);
//					if (status) {
//						AccountSection.main(new String[]{});
//						frame.dispose();
//					} else {
//						JOptionPane.showMessageDialog(AccountLogin.this, "Sorry, roll number or password error!", "Login error!", JOptionPane.ERROR_MESSAGE);
//					}
//				} catch (NumberFormatException ex) {
//					JOptionPane.showMessageDialog(AccountLogin.this, "Please enter a valid roll number", "Login error!", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
//
//		JButton btnBack = new JButton("Back");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LogInPage.main(new String[]{});
//				frame.dispose();
//			}
//		});
//
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(28)
//												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//														.addComponent(lblPassword)
//														.addGroup(gl_contentPane.createSequentialGroup()
//																.addComponent(lblRollno)
//																.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//																		.addGroup(gl_contentPane.createSequentialGroup()
//																				.addGap(76)
//																				.addComponent(lblAccountantLogin))
//																		.addGroup(gl_contentPane.createSequentialGroup()
//																				.addGap(54)
//																				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
//																						.addComponent(passwordField)
//																						.addComponent(textFieldRollno, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))))))
//										.addGroup(gl_contentPane.createSequentialGroup()
//												.addGap(120)
//												.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
//												.addGap(20)
//												.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
//								.addContainerGap(78, Short.MAX_VALUE))
//		);
//		gl_contentPane.setVerticalGroup(
//				gl_contentPane.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_contentPane.createSequentialGroup()
//								.addContainerGap()
//								.addComponent(lblAccountantLogin)
//								.addGap(18)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
//										.addComponent(lblRollno)
//										.addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addGap(18)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addComponent(lblPassword)
//										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//								.addPreferredGap(ComponentPlacement.UNRELATED)
//								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
//										.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
//										.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
//								.addContainerGap(5, Short.MAX_VALUE))
//		);
//		contentPane.setLayout(gl_contentPane);
//	}
//}



package com.javaproject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountLogin extends JFrame {
	static AccountLogin frame;
	private JPanel contentPane;
	private JTextField textFieldRollno;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AccountLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblAccountantLogin = new JLabel(" Account Login ");
		lblAccountantLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAccountantLogin.setForeground(Color.DARK_GRAY);

		JLabel lblRollno = new JLabel("Roll No:");

		textFieldRollno = new JTextField();
		textFieldRollno.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");

		passwordField = new JPasswordField();

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String rollnoStr = textFieldRollno.getText();
				String password = String.valueOf(passwordField.getPassword());
				try {
					int rollno = Integer.parseInt(rollnoStr);
					boolean status = AccountDao.validate(rollno, password);
					if (status) {
						AccountSection.main(new String[]{String.valueOf(rollno)});
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(AccountLogin.this, "Sorry, roll number or password error!", "Login error!", JOptionPane.ERROR_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(AccountLogin.this, "Please enter a valid roll number", "Login error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInPage.main(new String[]{});
				frame.dispose();
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(28)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblPassword)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lblRollno)
																.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(76)
																				.addComponent(lblAccountantLogin))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(54)
																				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
																						.addComponent(passwordField)
																						.addComponent(textFieldRollno, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))))))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(120)
												.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
												.addGap(20)
												.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblAccountantLogin)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblRollno)
										.addComponent(textFieldRollno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPassword)
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(5, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
